
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRevertStagedChangesAction" rel="nofollow">Revert Staged Changes</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RevertStagedChangesChange revertStagedChangesChange = RevertStagedChangesChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RevertStagedChangesChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RevertStagedChangesChangeImpl.class)
public interface RevertStagedChangesChange extends Change {

    /**
     * discriminator value for RevertStagedChangesChange
     */
    String REVERT_STAGED_CHANGES_CHANGE = "RevertStagedChangesChange";

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
     * @return instance of RevertStagedChangesChange
     */
    public static RevertStagedChangesChange of() {
        return new RevertStagedChangesChangeImpl();
    }

    /**
     * factory method to create a shallow copy RevertStagedChangesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RevertStagedChangesChange of(final RevertStagedChangesChange template) {
        RevertStagedChangesChangeImpl instance = new RevertStagedChangesChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    public RevertStagedChangesChange copyDeep();

    /**
     * factory method to create a deep copy of RevertStagedChangesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RevertStagedChangesChange deepCopy(@Nullable final RevertStagedChangesChange template) {
        if (template == null) {
            return null;
        }
        RevertStagedChangesChangeImpl instance = new RevertStagedChangesChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    /**
     * builder factory method for RevertStagedChangesChange
     * @return builder
     */
    public static RevertStagedChangesChangeBuilder builder() {
        return RevertStagedChangesChangeBuilder.of();
    }

    /**
     * create builder for RevertStagedChangesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RevertStagedChangesChangeBuilder builder(final RevertStagedChangesChange template) {
        return RevertStagedChangesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRevertStagedChangesChange(Function<RevertStagedChangesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RevertStagedChangesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RevertStagedChangesChange>() {
            @Override
            public String toString() {
                return "TypeReference<RevertStagedChangesChange>";
            }
        };
    }
}
