
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the attributes of the Variant. Existing attributes will be replaced with the new ones.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAttributesAction variantSetAttributesAction = VariantSetAttributesAction.builder()
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAttributes")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetAttributesActionImpl.class)
public interface VariantSetAttributesAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetAttributesAction
     */
    String SET_ATTRIBUTES = "setAttributes";

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>If <code>true</code>, only the staged attributes are updated. If <code>false</code>, both the current and staged attributes are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Attributes to set for the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     *  <p>If <code>true</code>, only the staged attributes are updated. If <code>false</code>, both the current and staged attributes are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of VariantSetAttributesAction
     */
    public static VariantSetAttributesAction of() {
        return new VariantSetAttributesActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetAttributesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetAttributesAction of(final VariantSetAttributesAction template) {
        VariantSetAttributesActionImpl instance = new VariantSetAttributesActionImpl();
        instance.setAttributes(template.getAttributes());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantSetAttributesAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetAttributesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetAttributesAction deepCopy(@Nullable final VariantSetAttributesAction template) {
        if (template == null) {
            return null;
        }
        VariantSetAttributesActionImpl instance = new VariantSetAttributesActionImpl();
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantSetAttributesAction
     * @return builder
     */
    public static VariantSetAttributesActionBuilder builder() {
        return VariantSetAttributesActionBuilder.of();
    }

    /**
     * create builder for VariantSetAttributesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAttributesActionBuilder builder(final VariantSetAttributesAction template) {
        return VariantSetAttributesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetAttributesAction(Function<VariantSetAttributesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetAttributesAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetAttributesAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetAttributesAction>";
            }
        };
    }
}
