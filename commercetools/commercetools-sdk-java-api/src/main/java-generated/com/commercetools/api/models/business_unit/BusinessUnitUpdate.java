package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
import com.commercetools.api.models.business_unit.BusinessUnitUpdateImpl;

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
 * BusinessUnitUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitUpdate businessUnitUpdate = BusinessUnitUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitUpdateImpl.class)
public interface BusinessUnitUpdate extends com.commercetools.api.models.ResourceUpdate<  BusinessUnitUpdate, BusinessUnitUpdateAction, BusinessUnitUpdateBuilder> {


    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<BusinessUnitUpdateAction> getActions();

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     */
    
    public void setVersion(final Long version);
    
    
    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param actions values to be set
     */
    
    @JsonIgnore
    public void setActions(final BusinessUnitUpdateAction ...actions);
    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param actions values to be set
     */
    
    public void setActions(final List<BusinessUnitUpdateAction> actions);

    /**
     * factory method
     * @return instance of BusinessUnitUpdate
     */
    public static BusinessUnitUpdate of(){
        return new BusinessUnitUpdateImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitUpdate of(final BusinessUnitUpdate template) {
        BusinessUnitUpdateImpl instance = new BusinessUnitUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitUpdate deepCopy(@Nullable final BusinessUnitUpdate template) {
        if (template == null) {
            return null;
        }
        BusinessUnitUpdateImpl instance = new BusinessUnitUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream().map(com.commercetools.api.models.business_unit.BusinessUnitUpdateAction::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitUpdate
     * @return builder
     */
    public static BusinessUnitUpdateBuilder builder() {
        return BusinessUnitUpdateBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitUpdateBuilder builder(final BusinessUnitUpdate template) {
        return BusinessUnitUpdateBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitUpdate(Function<BusinessUnitUpdate, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitUpdate>";
            }
        };
    }
}
