
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneSetDescriptionAction zoneSetDescriptionAction = ZoneSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ZoneSetDescriptionActionImpl.class)
public interface ZoneSetDescriptionAction extends ZoneUpdateAction {

    /**
     * discriminator value for ZoneSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Description of the Zone.</p>
     * @return description
     */

    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Description of the Zone.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     * factory method
     * @return instance of ZoneSetDescriptionAction
     */
    public static ZoneSetDescriptionAction of() {
        return new ZoneSetDescriptionActionImpl();
    }

    /**
     * factory method to copy an instance of ZoneSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ZoneSetDescriptionAction of(final ZoneSetDescriptionAction template) {
        ZoneSetDescriptionActionImpl instance = new ZoneSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * builder factory method for ZoneSetDescriptionAction
     * @return builder
     */
    public static ZoneSetDescriptionActionBuilder builder() {
        return ZoneSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for ZoneSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneSetDescriptionActionBuilder builder(final ZoneSetDescriptionAction template) {
        return ZoneSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneSetDescriptionAction(Function<ZoneSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneSetDescriptionAction>";
            }
        };
    }
}
