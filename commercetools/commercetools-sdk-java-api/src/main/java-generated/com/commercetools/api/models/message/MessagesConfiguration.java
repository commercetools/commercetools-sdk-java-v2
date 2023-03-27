
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Holds the configuration for the Messages Query feature for the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MessagesConfiguration messagesConfiguration = MessagesConfiguration.builder()
 *             .enabled(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MessagesConfigurationImpl.class)
public interface MessagesConfiguration {

    /**
     *  <p>When <code>true</code>, the Messages Query feature is active.</p>
     * @return enabled
     */
    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    /**
     *  <p>Specifies the number of days each Message should be available via the Messages Query API. For Messages older than the specified period, it is not guaranteed that they are still accessible via the API. This field may not be present on Projects created before 8 October 2018.</p>
     * @return deleteDaysAfterCreation
     */

    @JsonProperty("deleteDaysAfterCreation")
    public Integer getDeleteDaysAfterCreation();

    /**
     *  <p>When <code>true</code>, the Messages Query feature is active.</p>
     * @param enabled value to be set
     */

    public void setEnabled(final Boolean enabled);

    /**
     *  <p>Specifies the number of days each Message should be available via the Messages Query API. For Messages older than the specified period, it is not guaranteed that they are still accessible via the API. This field may not be present on Projects created before 8 October 2018.</p>
     * @param deleteDaysAfterCreation value to be set
     */

    public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation);

    /**
     * factory method
     * @return instance of MessagesConfiguration
     */
    public static MessagesConfiguration of() {
        return new MessagesConfigurationImpl();
    }

    /**
     * factory method to copy an instance of MessagesConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    public static MessagesConfiguration of(final MessagesConfiguration template) {
        MessagesConfigurationImpl instance = new MessagesConfigurationImpl();
        instance.setEnabled(template.getEnabled());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        return instance;
    }

    /**
     * builder factory method for MessagesConfiguration
     * @return builder
     */
    public static MessagesConfigurationBuilder builder() {
        return MessagesConfigurationBuilder.of();
    }

    /**
     * create builder for MessagesConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MessagesConfigurationBuilder builder(final MessagesConfiguration template) {
        return MessagesConfigurationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMessagesConfiguration(Function<MessagesConfiguration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MessagesConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessagesConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<MessagesConfiguration>";
            }
        };
    }
}
