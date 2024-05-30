
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionDraft extensionDraft = ExtensionDraft.builder()
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .plusTriggers(triggersBuilder -> triggersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionDraftImpl.class)
public interface ExtensionDraft
        extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ExtensionDraft> {

    /**
     *  <p>User-defined unique identifier for the Extension.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Defines where the Extension can be reached.</p>
     * @return destination
     */
    @NotNull
    @Valid
    @JsonProperty("destination")
    public ExtensionDestination getDestination();

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @return triggers
     */
    @NotNull
    @Valid
    @JsonProperty("triggers")
    public List<ExtensionTrigger> getTriggers();

    /**
     *  <p>Maximum time (in milliseconds) the Extension can respond within. If no timeout is provided, the default value is used for all types of Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     *  <p>This limit can be increased per Project after we review the performance impact. Please contact the Composable Commerce support team and provide the Region, Project key, and use case.</p>
     * @return timeoutInMs
     */

    @JsonProperty("timeoutInMs")
    public Integer getTimeoutInMs();

    /**
     *  <p>User-defined unique identifier for the Extension.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Defines where the Extension can be reached.</p>
     * @param destination value to be set
     */

    public void setDestination(final ExtensionDestination destination);

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param triggers values to be set
     */

    @JsonIgnore
    public void setTriggers(final ExtensionTrigger... triggers);

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param triggers values to be set
     */

    public void setTriggers(final List<ExtensionTrigger> triggers);

    /**
     *  <p>Maximum time (in milliseconds) the Extension can respond within. If no timeout is provided, the default value is used for all types of Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     *  <p>This limit can be increased per Project after we review the performance impact. Please contact the Composable Commerce support team and provide the Region, Project key, and use case.</p>
     * @param timeoutInMs value to be set
     */

    public void setTimeoutInMs(final Integer timeoutInMs);

    /**
     * factory method
     * @return instance of ExtensionDraft
     */
    public static ExtensionDraft of() {
        return new ExtensionDraftImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionDraft of(final ExtensionDraft template) {
        ExtensionDraftImpl instance = new ExtensionDraftImpl();
        instance.setKey(template.getKey());
        instance.setDestination(template.getDestination());
        instance.setTriggers(template.getTriggers());
        instance.setTimeoutInMs(template.getTimeoutInMs());
        return instance;
    }

    /**
     * factory method to create a deep copy of ExtensionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionDraft deepCopy(@Nullable final ExtensionDraft template) {
        if (template == null) {
            return null;
        }
        ExtensionDraftImpl instance = new ExtensionDraftImpl();
        instance.setKey(template.getKey());
        instance.setDestination(
            com.commercetools.api.models.extension.ExtensionDestination.deepCopy(template.getDestination()));
        instance.setTriggers(Optional.ofNullable(template.getTriggers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.extension.ExtensionTrigger::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTimeoutInMs(template.getTimeoutInMs());
        return instance;
    }

    /**
     * builder factory method for ExtensionDraft
     * @return builder
     */
    public static ExtensionDraftBuilder builder() {
        return ExtensionDraftBuilder.of();
    }

    /**
     * create builder for ExtensionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionDraftBuilder builder(final ExtensionDraft template) {
        return ExtensionDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionDraft(Function<ExtensionDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionDraft>";
            }
        };
    }
}
