package models;

import enums.*;

public class Project {
    private String name;
    private String announcement;
    private boolean isShowAnnouncement;
    private ProjectType projectType;

    private AccessType default_access;

    private String defect_view_url;
    private String defect_add_url;
    private PluginType defect_plugin;
    private String details;

    private String reference_view_url;
    private String reference_add_url;
    private PluginType reference_plugin;

    private String label;
    private String description;
    private String system_name;
    private String type;
    private String fallback;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public boolean isShowAnnouncement() {
        return isShowAnnouncement;
    }

    public void setShowAnnouncement(boolean showAnnouncement) {
        isShowAnnouncement = showAnnouncement;
    }

    public ProjectType getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectType projectType) {
        this.projectType = projectType;
    }

    public AccessType getDefault_access() {
        return default_access;
    }

    public void setDefault_access(AccessType default_access) {
        this.default_access = default_access;
    }

    public String getDefect_view_url() {
        return defect_view_url;
    }

    public void setDefect_view_url(String defect_view_url) {
        this.defect_view_url = defect_view_url;
    }

    public String getDefect_add_url() {
        return defect_add_url;
    }

    public void setDefect_add_url(String defect_add_url) {
        this.defect_add_url = defect_add_url;
    }

    public PluginType getDefect_plugin() {
        return defect_plugin;
    }

    public void setDefect_plugin(PluginType defect_plugin) {
        this.defect_plugin = defect_plugin;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getReference_view_url() {
        return reference_view_url;
    }

    public void setReference_view_url(String reference_view_url) {
        this.reference_view_url = reference_view_url;
    }

    public String getReference_add_url() {
        return reference_add_url;
    }

    public void setReference_add_url(String reference_add_url) {
        this.reference_add_url = reference_add_url;
    }

    public PluginType getReference_plugin() {
        return reference_plugin;
    }

    public void setReference_plugin(PluginType reference_plugin) {
        this.reference_plugin = reference_plugin;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSystem_name() {
        return system_name;
    }

    public void setSystem_name(String system_name) {
        this.system_name = system_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }
}
