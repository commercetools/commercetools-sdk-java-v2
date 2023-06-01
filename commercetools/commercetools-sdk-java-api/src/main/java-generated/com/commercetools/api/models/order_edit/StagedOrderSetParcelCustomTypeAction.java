package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderSetParcelCustomTypeActionImpl;

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
 * StagedOrderSetParcelCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetParcelCustomTypeAction stagedOrderSetParcelCustomTypeAction = StagedOrderSetParcelCustomTypeAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetParcelCustomTypeActionImpl.class)
public interface StagedOrderSetParcelCustomTypeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetParcelCustomTypeAction
     */
    String SET_PARCEL_CUSTOM_TYPE = "setParcelCustomType";

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();
    /**
     *  <p>Defines the Type that extends the Parcel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    /**
     *  <p>Sets the Custom Fields fields for the Parcel.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     * set parcelId
     * @param parcelId value to be set
     */
    
    public void setParcelId(final String parcelId);
    
    
    /**
     *  <p>Defines the Type that extends the Parcel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @param type value to be set
     */
    
    public void setType(final TypeResourceIdentifier type);
    
    
    /**
     *  <p>Sets the Custom Fields fields for the Parcel.</p>
     * @param fields value to be set
     */
    
    public void setFields(final FieldContainer fields);
    

    /**
     * factory method
     * @return instance of StagedOrderSetParcelCustomTypeAction
     */
    public static StagedOrderSetParcelCustomTypeAction of(){
        return new StagedOrderSetParcelCustomTypeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderSetParcelCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetParcelCustomTypeAction of(final StagedOrderSetParcelCustomTypeAction template) {
        StagedOrderSetParcelCustomTypeActionImpl instance = new StagedOrderSetParcelCustomTypeActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetParcelCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetParcelCustomTypeAction deepCopy(@Nullable final StagedOrderSetParcelCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetParcelCustomTypeActionImpl instance = new StagedOrderSetParcelCustomTypeActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetParcelCustomTypeAction
     * @return builder
     */
    public static StagedOrderSetParcelCustomTypeActionBuilder builder() {
        return StagedOrderSetParcelCustomTypeActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderSetParcelCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetParcelCustomTypeActionBuilder builder(final StagedOrderSetParcelCustomTypeAction template) {
        return StagedOrderSetParcelCustomTypeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetParcelCustomTypeAction(Function<StagedOrderSetParcelCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetParcelCustomTypeAction>";
            }
        };
    }
}
