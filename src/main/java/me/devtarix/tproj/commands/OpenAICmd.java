package me.devtarix.tproj.commands;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import me.devtarix.tproj.Config;
import me.devtarix.tproj.utils.Command;

public class OpenAICmd implements Command {
    public OpenAICmd() {
        register("gpt");
    }

    private static final String APIKEY = Config.getConfig().getProperty("OPENAI_API_KEY");

    @Override
    public void textCommand() {
        subCommand();
    }

    @Override
    public void textCommand(String[] args) {
        textCommand();
    }

    private void subCommand() {
        String subcmd = cQuery("subcommand");

        switch (subcmd) {
            case "set":
                setCommand();
                break;
            case "completion":
                requestCompletion();
                break;
            case "info":
                getInfo();
                break;
            default:
                System.err.println("Unknown subcommand");
                break;
        }

    }

    private void setCommand() {
        String setcmd = cQuery("the variable you would like to modify");

        switch (setcmd) {
            case "model":
                modelSelect();
                break;
            case "temperature":
                temperature = Double.parseDouble(cQuery("temperature"));
                break;
            case "maxtokens":
                int i = Integer.parseInt(cQuery("maximum tokens"));
                if (i > 1000) {
                    System.out.println("You are exceeding 1k tokens");
                }
                if (i > 2048) {
                    System.out.println("Select models cannot go above 2048 tokens");
                }
                max_tokens=i;
                break;
            case "n":
                int j = Integer.parseInt(cQuery("n"));
                if (j>1) {
                    System.out.println("You are warned that any value over 1 linearly increases token count");
                }
                n=j;
                break;
            case "echo":
                echo=Boolean.parseBoolean(cQuery("echo"));
                break;
            case "stop":
                String stopq =cQuery("stop characters");
                if (stopq.equals("//n")) {
                    stop="\n";
                } else if (stopq.equals("null")) {
                    stop=null;
                } else {
                    stop=stopq;
                }
                break;
            default:
                System.err.println("Unknown variable...");
                break;
        }
    }

    private void modelSelect() {
        String modelName = cQuery("model");
        switch (modelName) {
            case "davinci":
                model=Models.DAVINCI.toString();
                break;
            case "curie":
                model=Models.CURIE.toString();
                break;
            case "babbage":
                model=Models.BABBAGE.toString();
                break;
            case "ada":
                model=Models.ADA.toString();
                break;
            case "code":
                model=Models.CODE.toString();
                break;
            case "codefast":
                model=Models.CODEFAST.toString();
                break;
            default:
                System.out.println("Unknown model");
                break;
        }
    }

    private String model = String.valueOf(Models.DAVINCI);
    private String prompt;
    private double temperature = 0.2;
    private int max_tokens = 32;
    private int n = 1;
    private boolean echo = true;
    private String stop = "\n";

    private void getInfo() {
        System.out.println(model);
        System.out.println(temperature);
        System.out.println(max_tokens);
        System.out.println(n);
        System.out.println(echo);
        System.out.println(stop);
    }


    private String cQuery(String lmsg) {
        System.out.println("Please input "+lmsg.toLowerCase()+":");
        return System.console().readLine();
    }

    protected enum Models {
        DAVINCI("text-davinci-003"),CURIE("text-curie-001"),BABBAGE("text-babbage-001"),ADA("text-ada-001"),CODE("code-davinci-002"),CODEFAST("code-cushman-001");

        private final String text;

        Models(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    void requestCompletion() {
        OpenAiService service = new OpenAiService(APIKEY);
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(cQuery("prompt"))
                .model(model)
                .temperature(temperature)
                .maxTokens(max_tokens)
                .n(n)
                .echo(echo)
                .build();
        service.createCompletion(completionRequest).getChoices().forEach(System.out::println);
    }
}
