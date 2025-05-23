
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * TypeChangeLabelAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeLabelAction typeChangeLabelAction = TypeChangeLabelAction.builder()
 *             .fieldName("{fieldName}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeChangeLabelActionImpl.class)
public interface TypeChangeLabelAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeChangeLabelAction
     */
    String CHANGE_LABEL = "changeLabel";

    /**
     *  <p>Name of the Field Definition to update.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Name of the Field Definition to update.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     * factory method
     * @return instance of TypeChangeLabelAction
     */
    public static TypeChangeLabelAction of() {
        return new TypeChangeLabelActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeChangeLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeChangeLabelAction of(final TypeChangeLabelAction template) {
        TypeChangeLabelActionImpl instance = new TypeChangeLabelActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public TypeChangeLabelAction copyDeep();

    /**
     * factory method to create a deep copy of TypeChangeLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeChangeLabelAction deepCopy(@Nullable final TypeChangeLabelAction template) {
        if (template == null) {
            return null;
        }
        TypeChangeLabelActionImpl instance = new TypeChangeLabelActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setLabel(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getLabel()));
        return instance;
    }

    /**
     * builder factory method for TypeChangeLabelAction
     * @return builder
     */
    public static TypeChangeLabelActionBuilder builder() {
        return TypeChangeLabelActionBuilder.of();
    }

    /**
     * create builder for TypeChangeLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeLabelActionBuilder builder(final TypeChangeLabelAction template) {
        return TypeChangeLabelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeChangeLabelAction(Function<TypeChangeLabelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeLabelAction>";
            }
        };
    }
}
