package org.plantuml.idea.action;

import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileDocumentManagerListener;
import com.intellij.openapi.vfs.VirtualFile;

/**
 * Created by bryanhunt on 23/10/2015.
 */
public class ExampleFileChangeListener implements FileDocumentManagerListener {
    @Override
    public void beforeAllDocumentsSaving() {
        System.out.println("beforeAllDocumentsSaving");
    }

    @Override
    public void beforeDocumentSaving(Document document) {
        System.out.println("beforeDocumentSaving" + document.toString());
    }

    @Override
    public void beforeFileContentReload(VirtualFile virtualFile, Document document) {
        System.out.println("beforeFileContentReload");
    }

    @Override
    public void fileWithNoDocumentChanged(VirtualFile virtualFile) {
        System.out.println("fileWithNoDocumentChanged" + virtualFile);
    }

    @Override
    public void fileContentReloaded(VirtualFile virtualFile, Document document) {
        System.out.println("fileContentReloaded");
    }

    @Override
    public void fileContentLoaded(VirtualFile virtualFile, Document document) {
        System.out.println("fileContentLoaded");
    }

    @Override
    public void unsavedDocumentsDropped() {
        System.out.println("unsavedDocumentsDropped");
    }
}
