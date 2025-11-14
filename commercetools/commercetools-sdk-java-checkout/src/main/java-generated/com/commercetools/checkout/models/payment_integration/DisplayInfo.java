
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.LocalizedString;
import com.commercetools.checkout.models.common.LocalizedUrl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Display information for the payment integration in the UI.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DisplayInfo displayInfo = DisplayInfo.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DisplayInfoImpl.class)
public interface DisplayInfo {

    /**
     *  <p>Label of the payment method displayed in the UI.</p>
     * @return label
     */
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Logo of the payment method displayed in the UI.</p>
     * @return logoUrl
     */
    @Valid
    @JsonProperty("logoUrl")
    public LocalizedUrl getLogoUrl();

    /**
     *  <p>Description of the payment method displayed in the UI.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Text of the Pay button displayed in the UI when paying with the payment method.</p>
     * @return payButtonText
     */
    @Valid
    @JsonProperty("payButtonText")
    public LocalizedString getPayButtonText();

    /**
     *  <p>Label of the payment method displayed in the UI.</p>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     *  <p>Logo of the payment method displayed in the UI.</p>
     * @param logoUrl value to be set
     */

    public void setLogoUrl(final LocalizedUrl logoUrl);

    /**
     *  <p>Description of the payment method displayed in the UI.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Text of the Pay button displayed in the UI when paying with the payment method.</p>
     * @param payButtonText value to be set
     */

    public void setPayButtonText(final LocalizedString payButtonText);

    /**
     * factory method
     * @return instance of DisplayInfo
     */
    public static DisplayInfo of() {
        return new DisplayInfoImpl();
    }

    /**
     * factory method to create a shallow copy DisplayInfo
     * @param template instance to be copied
     * @return copy instance
     */
    public static DisplayInfo of(final DisplayInfo template) {
        DisplayInfoImpl instance = new DisplayInfoImpl();
        instance.setLabel(template.getLabel());
        instance.setLogoUrl(template.getLogoUrl());
        instance.setDescription(template.getDescription());
        instance.setPayButtonText(template.getPayButtonText());
        return instance;
    }

    public DisplayInfo copyDeep();

    /**
     * factory method to create a deep copy of DisplayInfo
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DisplayInfo deepCopy(@Nullable final DisplayInfo template) {
        if (template == null) {
            return null;
        }
        DisplayInfoImpl instance = new DisplayInfoImpl();
        instance.setLabel(com.commercetools.checkout.models.common.LocalizedString.deepCopy(template.getLabel()));
        instance.setLogoUrl(com.commercetools.checkout.models.common.LocalizedUrl.deepCopy(template.getLogoUrl()));
        instance.setDescription(
            com.commercetools.checkout.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setPayButtonText(
            com.commercetools.checkout.models.common.LocalizedString.deepCopy(template.getPayButtonText()));
        return instance;
    }

    /**
     * builder factory method for DisplayInfo
     * @return builder
     */
    public static DisplayInfoBuilder builder() {
        return DisplayInfoBuilder.of();
    }

    /**
     * create builder for DisplayInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DisplayInfoBuilder builder(final DisplayInfo template) {
        return DisplayInfoBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDisplayInfo(Function<DisplayInfo, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DisplayInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DisplayInfo>() {
            @Override
            public String toString() {
                return "TypeReference<DisplayInfo>";
            }
        };
    }
}
