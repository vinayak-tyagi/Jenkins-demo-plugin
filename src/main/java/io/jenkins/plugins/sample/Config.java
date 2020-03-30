package io.jenkins.plugins.sample;

import hudson.model.Run;
import jenkins.model.RunAction2;

import javax.annotation.CheckForNull;

public class Config implements RunAction2 {
    private  String name;
    private transient Run run;

    @CheckForNull
    @Override
    public String getIconFileName() {
        return "document.png";
    }

    @CheckForNull
    @Override
    public String getDisplayName() {
        return "Configurations";
    }

    @CheckForNull
    @Override
    public String getUrlName() {
        return "Configurations";
    }

    // Step-2
    public Config(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void onAttached(Run<?, ?> run) {
        this.run = run;
    }

    @Override
    public void onLoad(Run<?, ?> run) {
        this.run =run;
    }

    public Run getRun(){
        return run;
    }

}
