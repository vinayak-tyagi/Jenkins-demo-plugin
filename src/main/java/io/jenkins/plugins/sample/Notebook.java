package io.jenkins.plugins.sample;

import hudson.model.Action;
import hudson.model.RootAction;
import hudson.model.Run;
import jenkins.model.RunAction2;
import javax.annotation.CheckForNull;

public class Notebook implements RunAction2 {
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
        return "Jupyter-Notebook";
    }

    @CheckForNull
    @Override
    public String getUrlName() {
        return "JupyterNotebook";
    }

    // Step-2
    public Notebook(String name){
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
