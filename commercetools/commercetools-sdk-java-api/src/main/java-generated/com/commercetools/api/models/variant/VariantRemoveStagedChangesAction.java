
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Removes all staged changes from the Variant, only the current data remains. Generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantStagedChangesRemovedMessage" rel="nofollow">VariantStagedChangesRemoved</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantRemoveStagedChangesAction variantRemoveStagedChangesAction = VariantRemoveStagedChangesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeStagedChanges")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantRemoveStagedChangesActionImpl.class)
public interface VariantRemoveStagedChangesAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantRemoveStagedChangesAction
     */
    String REMOVE_STAGED_CHANGES = "removeStagedChanges";

    /**
     * factory method
     * @return instance of VariantRemoveStagedChangesAction
     */
    public static VariantRemoveStagedChangesAction of() {
        return new VariantRemoveStagedChangesActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantRemoveStagedChangesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantRemoveStagedChangesAction of(final VariantRemoveStagedChangesAction template) {
        VariantRemoveStagedChangesActionImpl instance = new VariantRemoveStagedChangesActionImpl();
        return instance;
    }

    public VariantRemoveStagedChangesAction copyDeep();

    /**
     * factory method to create a deep copy of VariantRemoveStagedChangesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantRemoveStagedChangesAction deepCopy(@Nullable final VariantRemoveStagedChangesAction template) {
        if (template == null) {
            return null;
        }
        VariantRemoveStagedChangesActionImpl instance = new VariantRemoveStagedChangesActionImpl();
        return instance;
    }

    /**
     * builder factory method for VariantRemoveStagedChangesAction
     * @return builder
     */
    public static VariantRemoveStagedChangesActionBuilder builder() {
        return VariantRemoveStagedChangesActionBuilder.of();
    }

    /**
     * create builder for VariantRemoveStagedChangesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantRemoveStagedChangesActionBuilder builder(final VariantRemoveStagedChangesAction template) {
        return VariantRemoveStagedChangesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantRemoveStagedChangesAction(Function<VariantRemoveStagedChangesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantRemoveStagedChangesAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantRemoveStagedChangesAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantRemoveStagedChangesAction>";
            }
        };
    }
}
