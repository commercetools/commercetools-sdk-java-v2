package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneChangeNameActionImpl;

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
 * ZoneChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneChangeNameAction zoneChangeNameAction = ZoneChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ZoneChangeNameActionImpl.class)
public interface ZoneChangeNameAction extends ZoneUpdateAction {

    /**
     * discriminator value for ZoneChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New name of the Zone.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>New name of the Zone.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    

    /**
     * factory method
     * @return instance of ZoneChangeNameAction
     */
    public static ZoneChangeNameAction of(){
        return new ZoneChangeNameActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ZoneChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ZoneChangeNameAction of(final ZoneChangeNameAction template) {
        ZoneChangeNameActionImpl instance = new ZoneChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ZoneChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ZoneChangeNameAction deepCopy(@Nullable final ZoneChangeNameAction template) {
        if (template == null) {
            return null;
        }
        ZoneChangeNameActionImpl instance = new ZoneChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ZoneChangeNameAction
     * @return builder
     */
    public static ZoneChangeNameActionBuilder builder() {
        return ZoneChangeNameActionBuilder.of();
    }
    
    /**
     * create builder for ZoneChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneChangeNameActionBuilder builder(final ZoneChangeNameAction template) {
        return ZoneChangeNameActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneChangeNameAction(Function<ZoneChangeNameAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneChangeNameAction>";
            }
        };
    }
}
