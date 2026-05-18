
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
 * ApplicationAgreementDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationAgreementDraft applicationAgreementDraft = ApplicationAgreementDraft.builder()
 *             .name("{name}")
 *             .type(ApplicationAgreementType.TEXT)
 *             .status(ApplicationAgreementStatus.ACTIVE)
 *             .text(textBuilder -> textBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApplicationAgreementDraftImpl.class)
public interface ApplicationAgreementDraft extends io.vrap.rmf.base.client.Draft<ApplicationAgreementDraft> {

    /**
     *  <p>Unique name for identifying the agreement.</p>
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
     *  <p>Unique name for identifying the agreement.</p>
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
     * @return instance of ApplicationAgreementDraft
     */
    public static ApplicationAgreementDraft of() {
        return new ApplicationAgreementDraftImpl();
    }

    /**
     * factory method to create a shallow copy ApplicationAgreementDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApplicationAgreementDraft of(final ApplicationAgreementDraft template) {
        ApplicationAgreementDraftImpl instance = new ApplicationAgreementDraftImpl();
        instance.setName(template.getName());
        instance.setType(template.getType());
        instance.setStatus(template.getStatus());
        instance.setText(template.getText());
        return instance;
    }

    public ApplicationAgreementDraft copyDeep();

    /**
     * factory method to create a deep copy of ApplicationAgreementDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApplicationAgreementDraft deepCopy(@Nullable final ApplicationAgreementDraft template) {
        if (template == null) {
            return null;
        }
        ApplicationAgreementDraftImpl instance = new ApplicationAgreementDraftImpl();
        instance.setName(template.getName());
        instance.setType(template.getType());
        instance.setStatus(template.getStatus());
        instance.setText(com.commercetools.checkout.models.common.LocalizedString.deepCopy(template.getText()));
        return instance;
    }

    /**
     * builder factory method for ApplicationAgreementDraft
     * @return builder
     */
    public static ApplicationAgreementDraftBuilder builder() {
        return ApplicationAgreementDraftBuilder.of();
    }

    /**
     * create builder for ApplicationAgreementDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationAgreementDraftBuilder builder(final ApplicationAgreementDraft template) {
        return ApplicationAgreementDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApplicationAgreementDraft(Function<ApplicationAgreementDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApplicationAgreementDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApplicationAgreementDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ApplicationAgreementDraft>";
            }
        };
    }
}
