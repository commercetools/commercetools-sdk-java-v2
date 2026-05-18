
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegration paymentIntegration = PaymentIntegration.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .application(applicationBuilder -> applicationBuilder)
 *             .type("{type}")
 *             .name("{name}")
 *             .componentType(PaymentComponentType.COMPONENT)
 *             .connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationBuilder implements Builder<PaymentIntegration> {

    private String id;

    private Long version;

    @Nullable
    private String key;

    private com.commercetools.checkout.models.application.ApplicationReference application;

    @Nullable
    private com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus status;

    private String type;

    private String name;

    @Nullable
    private String predicate;

    private com.commercetools.checkout.models.payment_integration.PaymentComponentType componentType;

    private com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment;

    @Nullable
    private com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo;

    @Nullable
    private com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo;

    @Nullable
    private com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration automatedReversalConfiguration;

    private java.time.ZonedDateTime createdAt;

    @Nullable
    private com.commercetools.checkout.models.payment_integration.CreatedBy createdBy;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.checkout.models.payment_integration.LastModifiedBy lastModifiedBy;

    /**
     *  <p>Unique identifier of the PaymentIntegration.</p>
     * @param id value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the PaymentIntegration.</p>
     * @param version value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the PaymentIntegration. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Reference to an Application associated with the PaymentIntegration.</p>
     * @param builder function to build the application value
     * @return Builder
     */

    public PaymentIntegrationBuilder application(
            Function<com.commercetools.checkout.models.application.ApplicationReferenceBuilder, com.commercetools.checkout.models.application.ApplicationReferenceBuilder> builder) {
        this.application = builder.apply(com.commercetools.checkout.models.application.ApplicationReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to an Application associated with the PaymentIntegration.</p>
     * @param builder function to build the application value
     * @return Builder
     */

    public PaymentIntegrationBuilder withApplication(
            Function<com.commercetools.checkout.models.application.ApplicationReferenceBuilder, com.commercetools.checkout.models.application.ApplicationReference> builder) {
        this.application = builder
                .apply(com.commercetools.checkout.models.application.ApplicationReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to an Application associated with the PaymentIntegration.</p>
     * @param application value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder application(
            final com.commercetools.checkout.models.application.ApplicationReference application) {
        this.application = application;
        return this;
    }

    /**
     *  <p>Indicates whether the Payment Integration is active or not.</p>
     * @param status value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder status(
            @Nullable final com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Type of the PaymentIntegration, for example, card, Paypal, or Applepay. This field must be same as used by the payment service provider (PSP) and must be supported by the Connector.</p>
     *  <p>Use <code>drop-in</code> for drop-in Payment Integrations.</p>
     * @param type value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Name of the PaymentIntegration in the Merchant Center.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Predicate in JSONata format. Applies only when <code>componentType</code> is <code>Component</code>.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder predicate(@Nullable final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Indicates the component type of Payment Integration.</p>
     * @param componentType value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder componentType(
            final com.commercetools.checkout.models.payment_integration.PaymentComponentType componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     *  <p>Connector deployment info for the Payment Integration.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public PaymentIntegrationBuilder connectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Connector deployment info for the Payment Integration.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public PaymentIntegrationBuilder withConnectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Connector deployment info for the Payment Integration.</p>
     * @param connectorDeployment value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder connectorDeployment(
            final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.connectorDeployment = connectorDeployment;
        return this;
    }

    /**
     *  <p>Customization for the information that is displayed in the UI. Applies only when <code>componentType</code> is <code>Component</code></p>
     * @param builder function to build the displayInfo value
     * @return Builder
     */

    public PaymentIntegrationBuilder displayInfo(
            Function<com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder, com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder> builder) {
        this.displayInfo = builder.apply(com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Customization for the information that is displayed in the UI. Applies only when <code>componentType</code> is <code>Component</code></p>
     * @param builder function to build the displayInfo value
     * @return Builder
     */

    public PaymentIntegrationBuilder withDisplayInfo(
            Function<com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder, com.commercetools.checkout.models.payment_integration.DisplayInfo> builder) {
        this.displayInfo = builder.apply(com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Customization for the information that is displayed in the UI. Applies only when <code>componentType</code> is <code>Component</code></p>
     * @param displayInfo value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder displayInfo(
            @Nullable final com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo) {
        this.displayInfo = displayInfo;
        return this;
    }

    /**
     *  <p>Sorting information of the Payment Integration.</p>
     * @param builder function to build the sortingInfo value
     * @return Builder
     */

    public PaymentIntegrationBuilder sortingInfo(
            Function<com.commercetools.checkout.models.payment_integration.SortingInfoBuilder, com.commercetools.checkout.models.payment_integration.SortingInfoBuilder> builder) {
        this.sortingInfo = builder.apply(com.commercetools.checkout.models.payment_integration.SortingInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sorting information of the Payment Integration.</p>
     * @param builder function to build the sortingInfo value
     * @return Builder
     */

    public PaymentIntegrationBuilder withSortingInfo(
            Function<com.commercetools.checkout.models.payment_integration.SortingInfoBuilder, com.commercetools.checkout.models.payment_integration.SortingInfo> builder) {
        this.sortingInfo = builder.apply(com.commercetools.checkout.models.payment_integration.SortingInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Sorting information of the Payment Integration.</p>
     * @param sortingInfo value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder sortingInfo(
            @Nullable final com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo) {
        this.sortingInfo = sortingInfo;
        return this;
    }

    /**
     *  <p>Configuration of the Payment Integration automatic reversal.</p>
     * @param builder function to build the automatedReversalConfiguration value
     * @return Builder
     */

    public PaymentIntegrationBuilder automatedReversalConfiguration(
            Function<com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder, com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder> builder) {
        this.automatedReversalConfiguration = builder
                .apply(com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Configuration of the Payment Integration automatic reversal.</p>
     * @param builder function to build the automatedReversalConfiguration value
     * @return Builder
     */

    public PaymentIntegrationBuilder withAutomatedReversalConfiguration(
            Function<com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder, com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration> builder) {
        this.automatedReversalConfiguration = builder.apply(
            com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder.of());
        return this;
    }

    /**
     *  <p>Configuration of the Payment Integration automatic reversal.</p>
     * @param automatedReversalConfiguration value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder automatedReversalConfiguration(
            @Nullable final com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration automatedReversalConfiguration) {
        this.automatedReversalConfiguration = automatedReversalConfiguration;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the PaymentIntegration was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>IDs and references that created the PaymentIntegration.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public PaymentIntegrationBuilder createdBy(
            Function<com.commercetools.checkout.models.payment_integration.CreatedByBuilder, com.commercetools.checkout.models.payment_integration.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.checkout.models.payment_integration.CreatedByBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>IDs and references that created the PaymentIntegration.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public PaymentIntegrationBuilder withCreatedBy(
            Function<com.commercetools.checkout.models.payment_integration.CreatedByBuilder, com.commercetools.checkout.models.payment_integration.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.checkout.models.payment_integration.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the PaymentIntegration.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder createdBy(
            @Nullable final com.commercetools.checkout.models.payment_integration.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the PaymentIntegration was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the PaymentIntegration.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public PaymentIntegrationBuilder lastModifiedBy(
            Function<com.commercetools.checkout.models.payment_integration.LastModifiedByBuilder, com.commercetools.checkout.models.payment_integration.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder
                .apply(com.commercetools.checkout.models.payment_integration.LastModifiedByBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the PaymentIntegration.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public PaymentIntegrationBuilder withLastModifiedBy(
            Function<com.commercetools.checkout.models.payment_integration.LastModifiedByBuilder, com.commercetools.checkout.models.payment_integration.LastModifiedBy> builder) {
        this.lastModifiedBy = builder
                .apply(com.commercetools.checkout.models.payment_integration.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the PaymentIntegration.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public PaymentIntegrationBuilder lastModifiedBy(
            @Nullable final com.commercetools.checkout.models.payment_integration.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Unique identifier of the PaymentIntegration.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the PaymentIntegration.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>User-defined unique identifier of the PaymentIntegration. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Reference to an Application associated with the PaymentIntegration.</p>
     * @return application
     */

    public com.commercetools.checkout.models.application.ApplicationReference getApplication() {
        return this.application;
    }

    /**
     *  <p>Indicates whether the Payment Integration is active or not.</p>
     * @return status
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Type of the PaymentIntegration, for example, card, Paypal, or Applepay. This field must be same as used by the payment service provider (PSP) and must be supported by the Connector.</p>
     *  <p>Use <code>drop-in</code> for drop-in Payment Integrations.</p>
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the PaymentIntegration in the Merchant Center.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Predicate in JSONata format. Applies only when <code>componentType</code> is <code>Component</code>.</p>
     * @return predicate
     */

    @Nullable
    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Indicates the component type of Payment Integration.</p>
     * @return componentType
     */

    public com.commercetools.checkout.models.payment_integration.PaymentComponentType getComponentType() {
        return this.componentType;
    }

    /**
     *  <p>Connector deployment info for the Payment Integration.</p>
     * @return connectorDeployment
     */

    public com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference getConnectorDeployment() {
        return this.connectorDeployment;
    }

    /**
     *  <p>Customization for the information that is displayed in the UI. Applies only when <code>componentType</code> is <code>Component</code></p>
     * @return displayInfo
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    /**
     *  <p>Sorting information of the Payment Integration.</p>
     * @return sortingInfo
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.SortingInfo getSortingInfo() {
        return this.sortingInfo;
    }

    /**
     *  <p>Configuration of the Payment Integration automatic reversal.</p>
     * @return automatedReversalConfiguration
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration getAutomatedReversalConfiguration() {
        return this.automatedReversalConfiguration;
    }

    /**
     *  <p>Date and time (UTC) the PaymentIntegration was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>IDs and references that created the PaymentIntegration.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Date and time (UTC) the PaymentIntegration was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the PaymentIntegration.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * builds PaymentIntegration with checking for non-null required values
     * @return PaymentIntegration
     */
    public PaymentIntegration build() {
        Objects.requireNonNull(id, PaymentIntegration.class + ": id is missing");
        Objects.requireNonNull(version, PaymentIntegration.class + ": version is missing");
        Objects.requireNonNull(application, PaymentIntegration.class + ": application is missing");
        Objects.requireNonNull(type, PaymentIntegration.class + ": type is missing");
        Objects.requireNonNull(name, PaymentIntegration.class + ": name is missing");
        Objects.requireNonNull(componentType, PaymentIntegration.class + ": componentType is missing");
        Objects.requireNonNull(connectorDeployment, PaymentIntegration.class + ": connectorDeployment is missing");
        Objects.requireNonNull(createdAt, PaymentIntegration.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, PaymentIntegration.class + ": lastModifiedAt is missing");
        return new PaymentIntegrationImpl(id, version, key, application, status, type, name, predicate, componentType,
            connectorDeployment, displayInfo, sortingInfo, automatedReversalConfiguration, createdAt, createdBy,
            lastModifiedAt, lastModifiedBy);
    }

    /**
     * builds PaymentIntegration without checking for non-null required values
     * @return PaymentIntegration
     */
    public PaymentIntegration buildUnchecked() {
        return new PaymentIntegrationImpl(id, version, key, application, status, type, name, predicate, componentType,
            connectorDeployment, displayInfo, sortingInfo, automatedReversalConfiguration, createdAt, createdBy,
            lastModifiedAt, lastModifiedBy);
    }

    /**
     * factory method for an instance of PaymentIntegrationBuilder
     * @return builder
     */
    public static PaymentIntegrationBuilder of() {
        return new PaymentIntegrationBuilder();
    }

    /**
     * create builder for PaymentIntegration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationBuilder of(final PaymentIntegration template) {
        PaymentIntegrationBuilder builder = new PaymentIntegrationBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.key = template.getKey();
        builder.application = template.getApplication();
        builder.status = template.getStatus();
        builder.type = template.getType();
        builder.name = template.getName();
        builder.predicate = template.getPredicate();
        builder.componentType = template.getComponentType();
        builder.connectorDeployment = template.getConnectorDeployment();
        builder.displayInfo = template.getDisplayInfo();
        builder.sortingInfo = template.getSortingInfo();
        builder.automatedReversalConfiguration = template.getAutomatedReversalConfiguration();
        builder.createdAt = template.getCreatedAt();
        builder.createdBy = template.getCreatedBy();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        return builder;
    }

}
