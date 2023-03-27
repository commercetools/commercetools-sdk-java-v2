
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeChangeFieldDefinitionOrderAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeFieldDefinitionOrderAction typeChangeFieldDefinitionOrderAction = TypeChangeFieldDefinitionOrderAction.builder()
 *             .plusFieldNames(fieldNamesBuilder -> fieldNamesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeChangeFieldDefinitionOrderActionImpl.class)
public interface TypeChangeFieldDefinitionOrderAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeChangeFieldDefinitionOrderAction
     */
    String CHANGE_FIELD_DEFINITION_ORDER = "changeFieldDefinitionOrder";

    /**
     *  <p>Must match the set of <code>name</code>s of FieldDefinitions (up to order).</p>
     * @return fieldNames
     */
    @NotNull
    @JsonProperty("fieldNames")
    public List<String> getFieldNames();

    /**
     *  <p>Must match the set of <code>name</code>s of FieldDefinitions (up to order).</p>
     * @param fieldNames values to be set
     */

    @JsonIgnore
    public void setFieldNames(final String... fieldNames);

    /**
     *  <p>Must match the set of <code>name</code>s of FieldDefinitions (up to order).</p>
     * @param fieldNames values to be set
     */

    public void setFieldNames(final List<String> fieldNames);

    /**
     * factory method
     * @return instance of TypeChangeFieldDefinitionOrderAction
     */
    public static TypeChangeFieldDefinitionOrderAction of() {
        return new TypeChangeFieldDefinitionOrderActionImpl();
    }

    /**
     * factory method to copy an instance of TypeChangeFieldDefinitionOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeChangeFieldDefinitionOrderAction of(final TypeChangeFieldDefinitionOrderAction template) {
        TypeChangeFieldDefinitionOrderActionImpl instance = new TypeChangeFieldDefinitionOrderActionImpl();
        instance.setFieldNames(template.getFieldNames());
        return instance;
    }

    /**
     * builder factory method for TypeChangeFieldDefinitionOrderAction
     * @return builder
     */
    public static TypeChangeFieldDefinitionOrderActionBuilder builder() {
        return TypeChangeFieldDefinitionOrderActionBuilder.of();
    }

    /**
     * create builder for TypeChangeFieldDefinitionOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeFieldDefinitionOrderActionBuilder builder(
            final TypeChangeFieldDefinitionOrderAction template) {
        return TypeChangeFieldDefinitionOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeChangeFieldDefinitionOrderAction(Function<TypeChangeFieldDefinitionOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeFieldDefinitionOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeFieldDefinitionOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeFieldDefinitionOrderAction>";
            }
        };
    }
}
