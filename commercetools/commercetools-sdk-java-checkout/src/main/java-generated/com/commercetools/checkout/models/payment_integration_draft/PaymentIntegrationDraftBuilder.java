
package com.commercetools.checkout.models.payment_integration_draft;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationDraft paymentIntegrationDraft = PaymentIntegrationDraft.builder()
 *             .application(applicationBuilder -> applicationBuilder)
 *             .type("{type}")
 *             .name("{name}")
 *             .componentType(PaymentComponentType.COMPONENT)
 *             .connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationDraftBuilder implements Builder<PaymentIntegrationDraft> {

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

    /**
     *  <p>User-defined unique identifier of the PaymentIntegration. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Reference to an Application associated with the PaymentIntegration.</p>
     * @param builder function to build the application value
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder application(
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

    public PaymentIntegrationDraftBuilder withApplication(
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

    public PaymentIntegrationDraftBuilder application(
            final com.commercetools.checkout.models.application.ApplicationReference application) {
        this.application = application;
        return this;
    }

    /**
     *  <p>Indicates whether the Payment Integration is active or not. By default in Inactive.</p>
     * @param status value to be set
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder status(
            @Nullable final com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Type of the PaymentIntegration. ie. card, paypal, applepay.</p>
     * @param type value to be set
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Name of the PaymentIntegration in the Merchant Center.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Predicate in JSONata format. Applies only when <code>componentType</code> is <code>Component</code>.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder predicate(@Nullable final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Indicates the component type of payment integration.</p>
     * @param componentType value to be set
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder componentType(
            final com.commercetools.checkout.models.payment_integration.PaymentComponentType componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     *  <p>Connector deployment info for the payment integration.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder connectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Connector deployment info for the payment integration.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder withConnectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Connector deployment info for the payment integration.</p>
     * @param connectorDeployment value to be set
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder connectorDeployment(
            final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.connectorDeployment = connectorDeployment;
        return this;
    }

    /**
     *  <p>Customization for the information that is displayed in the UI. Applies only when <code>componentType</code> is <code>Component</code></p>
     * @param builder function to build the displayInfo value
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder displayInfo(
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

    public PaymentIntegrationDraftBuilder withDisplayInfo(
            Function<com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder, com.commercetools.checkout.models.payment_integration.DisplayInfo> builder) {
        this.displayInfo = builder.apply(com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Customization for the information that is displayed in the UI. Applies only when <code>componentType</code> is <code>Component</code></p>
     * @param displayInfo value to be set
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder displayInfo(
            @Nullable final com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo) {
        this.displayInfo = displayInfo;
        return this;
    }

    /**
     *  <p>Sorting info of the payment integration.</p>
     * @param builder function to build the sortingInfo value
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder sortingInfo(
            Function<com.commercetools.checkout.models.payment_integration.SortingInfoBuilder, com.commercetools.checkout.models.payment_integration.SortingInfoBuilder> builder) {
        this.sortingInfo = builder.apply(com.commercetools.checkout.models.payment_integration.SortingInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sorting info of the payment integration.</p>
     * @param builder function to build the sortingInfo value
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder withSortingInfo(
            Function<com.commercetools.checkout.models.payment_integration.SortingInfoBuilder, com.commercetools.checkout.models.payment_integration.SortingInfo> builder) {
        this.sortingInfo = builder.apply(com.commercetools.checkout.models.payment_integration.SortingInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Sorting info of the payment integration.</p>
     * @param sortingInfo value to be set
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder sortingInfo(
            @Nullable final com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo) {
        this.sortingInfo = sortingInfo;
        return this;
    }

    /**
     *  <p>Configuration of the payment integration automatic reversal.</p>
     * @param builder function to build the automatedReversalConfiguration value
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder automatedReversalConfiguration(
            Function<com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder, com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder> builder) {
        this.automatedReversalConfiguration = builder
                .apply(com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Configuration of the payment integration automatic reversal.</p>
     * @param builder function to build the automatedReversalConfiguration value
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder withAutomatedReversalConfiguration(
            Function<com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder, com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration> builder) {
        this.automatedReversalConfiguration = builder.apply(
            com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationBuilder.of());
        return this;
    }

    /**
     *  <p>Configuration of the payment integration automatic reversal.</p>
     * @param automatedReversalConfiguration value to be set
     * @return Builder
     */

    public PaymentIntegrationDraftBuilder automatedReversalConfiguration(
            @Nullable final com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration automatedReversalConfiguration) {
        this.automatedReversalConfiguration = automatedReversalConfiguration;
        return this;
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
     *  <p>Indicates whether the Payment Integration is active or not. By default in Inactive.</p>
     * @return status
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Type of the PaymentIntegration. ie. card, paypal, applepay.</p>
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
     *  <p>Indicates the component type of payment integration.</p>
     * @return componentType
     */

    public com.commercetools.checkout.models.payment_integration.PaymentComponentType getComponentType() {
        return this.componentType;
    }

    /**
     *  <p>Connector deployment info for the payment integration.</p>
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
     *  <p>Sorting info of the payment integration.</p>
     * @return sortingInfo
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.SortingInfo getSortingInfo() {
        return this.sortingInfo;
    }

    /**
     *  <p>Configuration of the payment integration automatic reversal.</p>
     * @return automatedReversalConfiguration
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration getAutomatedReversalConfiguration() {
        return this.automatedReversalConfiguration;
    }

    /**
     * builds PaymentIntegrationDraft with checking for non-null required values
     * @return PaymentIntegrationDraft
     */
    public PaymentIntegrationDraft build() {
        Objects.requireNonNull(application, PaymentIntegrationDraft.class + ": application is missing");
        Objects.requireNonNull(type, PaymentIntegrationDraft.class + ": type is missing");
        Objects.requireNonNull(name, PaymentIntegrationDraft.class + ": name is missing");
        Objects.requireNonNull(componentType, PaymentIntegrationDraft.class + ": componentType is missing");
        Objects.requireNonNull(connectorDeployment, PaymentIntegrationDraft.class + ": connectorDeployment is missing");
        return new PaymentIntegrationDraftImpl(key, application, status, type, name, predicate, componentType,
            connectorDeployment, displayInfo, sortingInfo, automatedReversalConfiguration);
    }

    /**
     * builds PaymentIntegrationDraft without checking for non-null required values
     * @return PaymentIntegrationDraft
     */
    public PaymentIntegrationDraft buildUnchecked() {
        return new PaymentIntegrationDraftImpl(key, application, status, type, name, predicate, componentType,
            connectorDeployment, displayInfo, sortingInfo, automatedReversalConfiguration);
    }

    /**
     * factory method for an instance of PaymentIntegrationDraftBuilder
     * @return builder
     */
    public static PaymentIntegrationDraftBuilder of() {
        return new PaymentIntegrationDraftBuilder();
    }

    /**
     * create builder for PaymentIntegrationDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationDraftBuilder of(final PaymentIntegrationDraft template) {
        PaymentIntegrationDraftBuilder builder = new PaymentIntegrationDraftBuilder();
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
        return builder;
    }

}
