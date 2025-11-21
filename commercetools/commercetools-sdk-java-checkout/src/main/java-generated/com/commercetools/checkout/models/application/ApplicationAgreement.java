
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ApplicationAgreement
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationAgreement applicationAgreement = ApplicationAgreement.builder()
 *             .id("{id}")
 *             .name("{name}")
 *             .type(ApplicationAgreementType.TEXT)
 *             .status(ApplicationAgreementStatus.ACTIVE)
 *             .text(textBuilder -> textBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApplicationAgreementImpl.class)
public interface ApplicationAgreement {

    /**
     *  <p>Unique identifier of the ApplicationAgreement.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique name identifier for the ApplicationAgreement.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Type of agreement.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ApplicationAgreementType getType();

    /**
     *  <p>Indicates whether the agreement is active or not.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ApplicationAgreementStatus getStatus();

    /**
     *  <p>Text to display in checkout in Markdown format.</p>
     * @return text
     */
    @NotNull
    @Valid
    @JsonProperty("text")
    public LocalizedString getText();

    /**
     *  <p>Unique identifier of the ApplicationAgreement.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Unique name identifier for the ApplicationAgreement.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Type of agreement.</p>
     * @param type value to be set
     */

    public void setType(final ApplicationAgreementType type);

    /**
     *  <p>Indicates whether the agreement is active or not.</p>
     * @param status value to be set
     */

    public void setStatus(final ApplicationAgreementStatus status);

    /**
     *  <p>Text to display in checkout in Markdown format.</p>
     * @param text value to be set
     */

    public void setText(final LocalizedString text);

    /**
     * factory method
     * @return instance of ApplicationAgreement
     */
    public static ApplicationAgreement of() {
        return new ApplicationAgreementImpl();
    }

    /**
     * factory method to create a shallow copy ApplicationAgreement
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApplicationAgreement of(final ApplicationAgreement template) {
        ApplicationAgreementImpl instance = new ApplicationAgreementImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setType(template.getType());
        instance.setStatus(template.getStatus());
        instance.setText(template.getText());
        return instance;
    }

    public ApplicationAgreement copyDeep();

    /**
     * factory method to create a deep copy of ApplicationAgreement
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApplicationAgreement deepCopy(@Nullable final ApplicationAgreement template) {
        if (template == null) {
            return null;
        }
        ApplicationAgreementImpl instance = new ApplicationAgreementImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setType(template.getType());
        instance.setStatus(template.getStatus());
        instance.setText(com.commercetools.checkout.models.common.LocalizedString.deepCopy(template.getText()));
        return instance;
    }

    /**
     * builder factory method for ApplicationAgreement
     * @return builder
     */
    public static ApplicationAgreementBuilder builder() {
        return ApplicationAgreementBuilder.of();
    }

    /**
     * create builder for ApplicationAgreement instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationAgreementBuilder builder(final ApplicationAgreement template) {
        return ApplicationAgreementBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApplicationAgreement(Function<ApplicationAgreement, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApplicationAgreement> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApplicationAgreement>() {
            @Override
            public String toString() {
                return "TypeReference<ApplicationAgreement>";
            }
        };
    }
}
