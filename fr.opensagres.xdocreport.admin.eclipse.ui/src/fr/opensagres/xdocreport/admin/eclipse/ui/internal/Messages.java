package fr.opensagres.xdocreport.admin.eclipse.ui.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "fr.opensagres.xdocreport.admin.eclipse.ui.internal.Messages";//$NON-NLS-1$

	// -----------------------------
	public static String addButton_label;
	public static String removeButton_label;

	// Overview Page
	public static String ResourceEditor_OverviewPage_title;

	// Overview/General Info section
	public static String ResourceEditor_OverviewPage_GeneralInfo_title;
	public static String ResourceEditor_OverviewPage_GeneralInfo_resourceId_label;
	public static String ResourceEditor_OverviewPage_GeneralInfo_resourceName_label;

	public static String FileResourceEditor_OverviewPage_GeneralInfo_desc;
	public static String FolderResourceEditor_OverviewPage_GeneralInfo_desc;
	public static String TemplateResourceEditor_OverviewPage_GeneralInfo_desc;

	// ****************** TemplateResourceEditor ******************

	public static String TemplateResourceEditor_DocumentsPage_title;
	public static String TemplateResourceEditor_FieldsMetadataPage_title;

	public static String TemplateResourceEditor_DocumentsPage_DocumentsMasterDetailsBlock_title;
	public static String TemplateResourceEditor_DocumentsPage_DocumentsMasterDetailsBlock_desc;

	public static String TemplateResourceEditor_DocumentsPage_DocumentDetailsPage_title;
	public static String TemplateResourceEditor_DocumentsPage_DocumentDetailsPage_desc;
	public static String TemplateResourceEditor_DocumentsPage_DocumentDetailsPage_templateName_label;

	public static String TemplateResourceEditor_TemplateOverviewPage_TemplateResourceContent_title;
	public static String TemplateResourceEditor_TemplateOverviewPage_TemplateResourceContent_content;

	public static String TemplateResourceEditor_FieldsMetadataPage_FieldsMetadataMasterDetailsBlock_title;
	public static String TemplateResourceEditor_FieldsMetadataPage_FieldsMetadataMasterDetailsBlock_desc;

	public static String TemplateResourceEditor_FieldsMetadataPage_FieldMetadataDetailsPage_title;
	public static String TemplateResourceEditor_FieldsMetadataPage_FieldMetadataDetailsPage_desc;
	public static String TemplateResourceEditor_FieldsMetadataPage_FieldMetadataDetailsPage_fieldName_label;
	public static String TemplateResourceEditor_FieldsMetadataPage_FieldMetadataDetailsPage_fieldDescription_label;
	public static String TemplateResourceEditor_FieldsMetadataPage_FieldMetadataDetailsPage_fieldIsList_label;

	// Overview Page
	public static String RepositoryEditor_OverviewPage_title;

	// Overview/General Info section
	public static String RepositoryEditor_OverviewPage_GeneralInfo_title;
	public static String RepositoryEditor_OverviewPage_GeneralInfo_desc;
	public static String RepositoryEditor_OverviewPage_GeneralInfo_serviceType_label;
	public static String RepositoryEditor_OverviewPage_GeneralInfo_baseAddress_label;
	public static String RepositoryEditor_OverviewPage_GeneralInfo_userName_label;
	public static String RepositoryEditor_OverviewPage_GeneralInfo_password_label;
	public static String RepositoryEditor_OverviewPage_GeneralInfo_connectionTimeout_label;
	public static String RepositoryEditor_OverviewPage_GeneralInfo_allowChunking_label;

	// ****************** AddRepositoryDialog ******************

	public static String AddRepositoryDialog_title;
	public static String AddRepositoryDialog_serviceType_label;
	public static String AddRepositoryDialog_serviceType_validation_required;
	public static String AddRepositoryDialog_baseAddress_label;
	public static String AddRepositoryDialog_baseAddress_validation_required;
	public static String AddRepositoryDialog_user_label;
	public static String AddRepositoryDialog_password_label;
	public static String AddRepositoryDialog_allowChunking_label;
	public static String AddRepositoryDialog_connectionTimeout_label;

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
