package com.commercetools.api.models.message;

import com.commercetools.api.models.business_unit.Associate;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayloadImpl;

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
 *  <p>Generated after a successful Add Associate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateAddedMessagePayload businessUnitAssociateAddedMessagePayload = BusinessUnitAssociateAddedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitAssociateAddedMessagePayloadImpl.class)
public interface BusinessUnitAssociateAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAssociateAddedMessagePayload
     */
    String BUSINESS_UNIT_ASSOCIATE_ADDED = "BusinessUnitAssociateAdded";

    /**
     *  <p>The Associate that was added to the Business Unit.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public Associate getAssociate();

    /**
     *  <p>The Associate that was added to the Business Unit.</p>
     * @param associate value to be set
     */
    
    public void setAssociate(final Associate associate);
    

    /**
     * factory method
     * @return instance of BusinessUnitAssociateAddedMessagePayload
     */
    public static BusinessUnitAssociateAddedMessagePayload of(){
        return new BusinessUnitAssociateAddedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitAssociateAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAssociateAddedMessagePayload of(final BusinessUnitAssociateAddedMessagePayload template) {
        BusinessUnitAssociateAddedMessagePayloadImpl instance = new BusinessUnitAssociateAddedMessagePayloadImpl();
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAssociateAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAssociateAddedMessagePayload deepCopy(@Nullable final BusinessUnitAssociateAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAssociateAddedMessagePayloadImpl instance = new BusinessUnitAssociateAddedMessagePayloadImpl();
        instance.setAssociate(com.commercetools.api.models.business_unit.Associate.deepCopy(template.getAssociate()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAssociateAddedMessagePayload
     * @return builder
     */
    public static BusinessUnitAssociateAddedMessagePayloadBuilder builder() {
        return BusinessUnitAssociateAddedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitAssociateAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateAddedMessagePayloadBuilder builder(final BusinessUnitAssociateAddedMessagePayload template) {
        return BusinessUnitAssociateAddedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAssociateAddedMessagePayload(Function<BusinessUnitAssociateAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateAddedMessagePayload>";
            }
        };
    }
}
