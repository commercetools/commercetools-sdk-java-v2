package com.commercetools.api.models.standalone_price;

import com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionImpl;

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
 * StandalonePriceSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetCustomTypeAction standalonePriceSetCustomTypeAction = StandalonePriceSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StandalonePriceSetCustomTypeActionImpl.class)
public interface StandalonePriceSetCustomTypeAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the StandalonePrice with Custom Fields. If absent, any existing Type and Custom Fields are removed from the StandalonePrice.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    /**
     *  <p>Sets the Custom Fields fields for the StandalonePrice.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the StandalonePrice with Custom Fields. If absent, any existing Type and Custom Fields are removed from the StandalonePrice.</p>
     * @param type value to be set
     */
    
    public void setType(final TypeResourceIdentifier type);
    
    
    /**
     *  <p>Sets the Custom Fields fields for the StandalonePrice.</p>
     * @param fields value to be set
     */
    
    public void setFields(final FieldContainer fields);
    

    /**
     * factory method
     * @return instance of StandalonePriceSetCustomTypeAction
     */
    public static StandalonePriceSetCustomTypeAction of(){
        return new StandalonePriceSetCustomTypeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StandalonePriceSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetCustomTypeAction of(final StandalonePriceSetCustomTypeAction template) {
        StandalonePriceSetCustomTypeActionImpl instance = new StandalonePriceSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetCustomTypeAction deepCopy(@Nullable final StandalonePriceSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetCustomTypeActionImpl instance = new StandalonePriceSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetCustomTypeAction
     * @return builder
     */
    public static StandalonePriceSetCustomTypeActionBuilder builder() {
        return StandalonePriceSetCustomTypeActionBuilder.of();
    }
    
    /**
     * create builder for StandalonePriceSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetCustomTypeActionBuilder builder(final StandalonePriceSetCustomTypeAction template) {
        return StandalonePriceSetCustomTypeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetCustomTypeAction(Function<StandalonePriceSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetCustomTypeAction>";
            }
        };
    }
}
