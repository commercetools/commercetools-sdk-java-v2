
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PublishChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PublishChange publishChange = PublishChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PublishChangeImpl.class)
public interface PublishChange extends Change {

    /**
     * discriminator value for PublishChange
     */
    String PUBLISH_CHANGE = "PublishChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * factory method
     * @return instance of PublishChange
     */
    public static PublishChange of() {
        return new PublishChangeImpl();
    }

    /**
     * factory method to copy an instance of PublishChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static PublishChange of(final PublishChange template) {
        PublishChangeImpl instance = new PublishChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    /**
     * builder factory method for PublishChange
     * @return builder
     */
    public static PublishChangeBuilder builder() {
        return PublishChangeBuilder.of();
    }

    /**
     * create builder for PublishChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PublishChangeBuilder builder(final PublishChange template) {
        return PublishChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPublishChange(Function<PublishChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PublishChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PublishChange>() {
            @Override
            public String toString() {
                return "TypeReference<PublishChange>";
            }
        };
    }
}
