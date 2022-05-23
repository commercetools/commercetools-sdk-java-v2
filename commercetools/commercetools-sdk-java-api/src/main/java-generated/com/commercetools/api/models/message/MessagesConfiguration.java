
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 <p>Holds the configuration for the Messages Query feature for the Project.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MessagesConfiguration messagesConfiguration = MessagesConfiguration.builder()
           .enabled(true)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MessagesConfigurationImpl.class)
public interface MessagesConfiguration {

    /**
     *  <p>When <code>true</code>, the Messages Query feature is active.</p>
     */
    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    /**
     *  <p>Specifies the number of days each Message should be available via the Messages Query API. For Messages older than the specified period, it is not guaranteed that they are still accessible via the API. This field may not be present on Projects created before 8 October 2018.</p>
     */

    @JsonProperty("deleteDaysAfterCreation")
    public Integer getDeleteDaysAfterCreation();

    public void setEnabled(final Boolean enabled);

    public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation);

    public static MessagesConfiguration of() {
        return new MessagesConfigurationImpl();
    }

    public static MessagesConfiguration of(final MessagesConfiguration template) {
        MessagesConfigurationImpl instance = new MessagesConfigurationImpl();
        instance.setEnabled(template.getEnabled());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        return instance;
    }

    public static MessagesConfigurationBuilder builder() {
        return MessagesConfigurationBuilder.of();
    }

    public static MessagesConfigurationBuilder builder(final MessagesConfiguration template) {
        return MessagesConfigurationBuilder.of(template);
    }

    default <T> T withMessagesConfiguration(Function<MessagesConfiguration, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MessagesConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessagesConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<MessagesConfiguration>";
            }
        };
    }
}
