
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Unpublishes the Variant by setting the <code>published</code> flag to <code>false</code>. Generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantUnpublishedMessage" rel="nofollow">VariantUnpublished</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantUnpublishAction variantUnpublishAction = VariantUnpublishAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("unpublish")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantUnpublishActionImpl.class)
public interface VariantUnpublishAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantUnpublishAction
     */
    String UNPUBLISH = "unpublish";

    /**
     * factory method
     * @return instance of VariantUnpublishAction
     */
    public static VariantUnpublishAction of() {
        return new VariantUnpublishActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantUnpublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantUnpublishAction of(final VariantUnpublishAction template) {
        VariantUnpublishActionImpl instance = new VariantUnpublishActionImpl();
        return instance;
    }

    public VariantUnpublishAction copyDeep();

    /**
     * factory method to create a deep copy of VariantUnpublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantUnpublishAction deepCopy(@Nullable final VariantUnpublishAction template) {
        if (template == null) {
            return null;
        }
        VariantUnpublishActionImpl instance = new VariantUnpublishActionImpl();
        return instance;
    }

    /**
     * builder factory method for VariantUnpublishAction
     * @return builder
     */
    public static VariantUnpublishActionBuilder builder() {
        return VariantUnpublishActionBuilder.of();
    }

    /**
     * create builder for VariantUnpublishAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantUnpublishActionBuilder builder(final VariantUnpublishAction template) {
        return VariantUnpublishActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantUnpublishAction(Function<VariantUnpublishAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantUnpublishAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantUnpublishAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantUnpublishAction>";
            }
        };
    }
}
