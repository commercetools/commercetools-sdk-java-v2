
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * UnpublishChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnpublishChange unpublishChange = UnpublishChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UnpublishChangeImpl.class)
public interface UnpublishChange extends Change {

    /**
     * discriminator value for UnpublishChange
     */
    String UNPUBLISH_CHANGE = "UnpublishChange";

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
     * @return instance of UnpublishChange
     */
    public static UnpublishChange of() {
        return new UnpublishChangeImpl();
    }

    /**
     * factory method to create a shallow copy UnpublishChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static UnpublishChange of(final UnpublishChange template) {
        UnpublishChangeImpl instance = new UnpublishChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    /**
     * factory method to create a deep copy of UnpublishChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static UnpublishChange deepCopy(@Nullable final UnpublishChange template) {
        if (template == null) {
            return null;
        }
        UnpublishChangeImpl instance = new UnpublishChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    /**
     * builder factory method for UnpublishChange
     * @return builder
     */
    public static UnpublishChangeBuilder builder() {
        return UnpublishChangeBuilder.of();
    }

    /**
     * create builder for UnpublishChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnpublishChangeBuilder builder(final UnpublishChange template) {
        return UnpublishChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withUnpublishChange(Function<UnpublishChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<UnpublishChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UnpublishChange>() {
            @Override
            public String toString() {
                return "TypeReference<UnpublishChange>";
            }
        };
    }
}
