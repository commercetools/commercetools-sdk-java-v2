package com.commercetools.api.models.message;

import com.commercetools.api.models.business_unit.Associate;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayloadImpl;

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
 *  <p>Generated after a successful Remove Associate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateRemovedMessagePayload businessUnitAssociateRemovedMessagePayload = BusinessUnitAssociateRemovedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitAssociateRemovedMessagePayloadImpl.class)
public interface BusinessUnitAssociateRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAssociateRemovedMessagePayload
     */
    String BUSINESS_UNIT_ASSOCIATE_REMOVED = "BusinessUnitAssociateRemoved";

    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public Associate getAssociate();

    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     * @param associate value to be set
     */
    
    public void setAssociate(final Associate associate);
    

    /**
     * factory method
     * @return instance of BusinessUnitAssociateRemovedMessagePayload
     */
    public static BusinessUnitAssociateRemovedMessagePayload of(){
        return new BusinessUnitAssociateRemovedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitAssociateRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAssociateRemovedMessagePayload of(final BusinessUnitAssociateRemovedMessagePayload template) {
        BusinessUnitAssociateRemovedMessagePayloadImpl instance = new BusinessUnitAssociateRemovedMessagePayloadImpl();
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAssociateRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAssociateRemovedMessagePayload deepCopy(@Nullable final BusinessUnitAssociateRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAssociateRemovedMessagePayloadImpl instance = new BusinessUnitAssociateRemovedMessagePayloadImpl();
        instance.setAssociate(com.commercetools.api.models.business_unit.Associate.deepCopy(template.getAssociate()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAssociateRemovedMessagePayload
     * @return builder
     */
    public static BusinessUnitAssociateRemovedMessagePayloadBuilder builder() {
        return BusinessUnitAssociateRemovedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitAssociateRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateRemovedMessagePayloadBuilder builder(final BusinessUnitAssociateRemovedMessagePayload template) {
        return BusinessUnitAssociateRemovedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAssociateRemovedMessagePayload(Function<BusinessUnitAssociateRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateRemovedMessagePayload>";
            }
        };
    }
}
