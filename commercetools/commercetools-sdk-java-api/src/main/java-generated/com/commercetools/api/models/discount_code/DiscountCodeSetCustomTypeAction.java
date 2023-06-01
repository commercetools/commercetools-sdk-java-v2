package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * DiscountCodeSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetCustomTypeAction discountCodeSetCustomTypeAction = DiscountCodeSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DiscountCodeSetCustomTypeActionImpl.class)
public interface DiscountCodeSetCustomTypeAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the DiscountCode with Custom Fields. If absent, any existing Type and Custom Fields are removed from the DiscountCode.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    /**
     *  <p>Sets the Custom Fields fields for the DiscountCode.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the DiscountCode with Custom Fields. If absent, any existing Type and Custom Fields are removed from the DiscountCode.</p>
     * @param type value to be set
     */
    
    public void setType(final TypeResourceIdentifier type);
    
    
    /**
     *  <p>Sets the Custom Fields fields for the DiscountCode.</p>
     * @param fields value to be set
     */
    
    public void setFields(final FieldContainer fields);
    

    /**
     * factory method
     * @return instance of DiscountCodeSetCustomTypeAction
     */
    public static DiscountCodeSetCustomTypeAction of(){
        return new DiscountCodeSetCustomTypeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy DiscountCodeSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeSetCustomTypeAction of(final DiscountCodeSetCustomTypeAction template) {
        DiscountCodeSetCustomTypeActionImpl instance = new DiscountCodeSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeSetCustomTypeAction deepCopy(@Nullable final DiscountCodeSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        DiscountCodeSetCustomTypeActionImpl instance = new DiscountCodeSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for DiscountCodeSetCustomTypeAction
     * @return builder
     */
    public static DiscountCodeSetCustomTypeActionBuilder builder() {
        return DiscountCodeSetCustomTypeActionBuilder.of();
    }
    
    /**
     * create builder for DiscountCodeSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetCustomTypeActionBuilder builder(final DiscountCodeSetCustomTypeAction template) {
        return DiscountCodeSetCustomTypeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeSetCustomTypeAction(Function<DiscountCodeSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetCustomTypeAction>";
            }
        };
    }
}
