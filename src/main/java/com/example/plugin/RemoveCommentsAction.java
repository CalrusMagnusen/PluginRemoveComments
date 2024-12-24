package com.example.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiFile;
import com.intellij.openapi.application.ApplicationManager;
import org.jetbrains.annotations.NotNull;

public class RemoveCommentsAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        Project project = event.getProject();
        if (project == null) {
            return;
        }

        Editor editor = event.getData(com.intellij.openapi.actionSystem.CommonDataKeys.EDITOR);
        if (editor == null) {
            return;
        }

        PsiFile psiFile = event.getData(com.intellij.openapi.actionSystem.CommonDataKeys.PSI_FILE);
        if (psiFile == null) {
            Messages.showErrorDialog(project, "No file selected!", "Error");
            return;
        }

        Document document = editor.getDocument();
        String text = document.getText();

        String withoutComments = text.replaceAll("//.*", "") // Удаляем однострочные
                .replaceAll("/\\*.*?\\*/", ""); // Удаляем многострочные

        ApplicationManager.getApplication().runWriteAction(() -> {
            document.setText(withoutComments);
        });

        Messages.showInfoMessage(project, "Comments removed successfully!", "Success");
    }
}
