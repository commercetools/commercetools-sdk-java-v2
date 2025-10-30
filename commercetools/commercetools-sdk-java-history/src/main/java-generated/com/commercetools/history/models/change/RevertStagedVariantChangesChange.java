
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRevertStagedVariantChangesAction" rel="nofollow">Revert Staged Variant Changes</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RevertStagedVariantChangesChange revertStagedVariantChangesChange = RevertStagedVariantChangesChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RevertStagedVariantChangesChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RevertStagedVariantChangesChangeImpl.class)
public interface RevertStagedVariantChangesChange extends Change {

    /**
     * discriminator value for RevertStagedVariantChangesChange
     */
    String REVERT_STAGED_VARIANT_CHANGES_CHANGE = "RevertStagedVariantChangesChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * factory method
     * @return instance of RevertStagedVariantChangesChange
     */
    public static RevertStagedVariantChangesChange of() {
        return new RevertStagedVariantChangesChangeImpl();
    }

    /**
     * factory method to create a shallow copy RevertStagedVariantChangesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RevertStagedVariantChangesChange of(final RevertStagedVariantChangesChange template) {
        RevertStagedVariantChangesChangeImpl instance = new RevertStagedVariantChangesChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    public RevertStagedVariantChangesChange copyDeep();

    /**
     * factory method to create a deep copy of RevertStagedVariantChangesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RevertStagedVariantChangesChange deepCopy(@Nullable final RevertStagedVariantChangesChange template) {
        if (template == null) {
            return null;
        }
        RevertStagedVariantChangesChangeImpl instance = new RevertStagedVariantChangesChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    /**
     * builder factory method for RevertStagedVariantChangesChange
     * @return builder
     */
    public static RevertStagedVariantChangesChangeBuilder builder() {
        return RevertStagedVariantChangesChangeBuilder.of();
    }

    /**
     * create builder for RevertStagedVariantChangesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RevertStagedVariantChangesChangeBuilder builder(final RevertStagedVariantChangesChange template) {
        return RevertStagedVariantChangesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRevertStagedVariantChangesChange(Function<RevertStagedVariantChangesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RevertStagedVariantChangesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RevertStagedVariantChangesChange>() {
            @Override
            public String toString() {
                return "TypeReference<RevertStagedVariantChangesChange>";
            }
        };
    }
}
