package org.demo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class Main extends AnAction{
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Messages.showInfoMessage("Hello World", "Info");
    }
}