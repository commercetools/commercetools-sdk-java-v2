
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The CloudEventsFormat can be used with any Destination, and the payload is delivered in the <code>JSON Event Format</code>. AzureEventGridDestination offers native support to filter and route CloudEvents.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CloudEventsFormat cloudEventsFormat = CloudEventsFormat.builder()
 *             .cloudEventsVersion("{cloudEventsVersion}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CloudEventsFormatImpl.class)
public interface CloudEventsFormat extends DeliveryFormat {

    /**
     * discriminator value for CloudEventsFormat
     */
    String CLOUD_EVENTS = "CloudEvents";

    /**
     *
     * @return cloudEventsVersion
     */
    @NotNull
    @JsonProperty("cloudEventsVersion")
    public String getCloudEventsVersion();

    /**
     * set cloudEventsVersion
     * @param cloudEventsVersion value to be set
     */

    public void setCloudEventsVersion(final String cloudEventsVersion);

    /**
     * factory method
     * @return instance of CloudEventsFormat
     */
    public static CloudEventsFormat of() {
        return new CloudEventsFormatImpl();
    }

    /**
     * factory method to copy an instance of CloudEventsFormat
     * @param template instance to be copied
     * @return copy instance
     */
    public static CloudEventsFormat of(final CloudEventsFormat template) {
        CloudEventsFormatImpl instance = new CloudEventsFormatImpl();
        instance.setCloudEventsVersion(template.getCloudEventsVersion());
        return instance;
    }

    /**
     * builder factory method for CloudEventsFormat
     * @return builder
     */
    public static CloudEventsFormatBuilder builder() {
        return CloudEventsFormatBuilder.of();
    }

    /**
     * create builder for CloudEventsFormat instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CloudEventsFormatBuilder builder(final CloudEventsFormat template) {
        return CloudEventsFormatBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCloudEventsFormat(Function<CloudEventsFormat, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CloudEventsFormat> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CloudEventsFormat>() {
            @Override
            public String toString() {
                return "TypeReference<CloudEventsFormat>";
            }
        };
    }
}
