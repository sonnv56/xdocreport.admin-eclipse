package fr.opensagres.xdocreport.admin.eclipse.ui.editors.resources.template;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.PartInitException;

import fr.opensagres.xdocreport.admin.eclipse.ui.editors.resources.ResourceEditor;
import fr.opensagres.xdocreport.admin.eclipse.ui.editors.resources.ResourceEditorInput;
import fr.opensagres.xdocreport.remoting.resources.domain.Resource;
import fr.opensagres.xdocreport.remoting.resources.domain.ResourceType;

public class TemplateResourceEditor extends
		ResourceEditor<ResourceEditorInput, Resource> {

	public static final String ID = "fr.opensagres.xdocreport.admin.eclipse.ui.editors.resources.template.TemplateResourceEditor";

	public TemplateResourceEditor() {
		super(ResourceType.TEMPLATE);
	}

	@Override
	protected void doAddPages() {
		super.doAddPages();
		try {
			super.addPage(new DocumentsPage(this));
			super.addPage(new FieldsMetadataPage(this));
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Resource onSave(Resource modelObject, IProgressMonitor monitor) {
		// TODO: save it

		return null;
	}

}
