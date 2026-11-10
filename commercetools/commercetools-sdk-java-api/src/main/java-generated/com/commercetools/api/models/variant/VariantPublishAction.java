
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Publishes the Variant by copying the staged data to the current data and setting the <code>published</code> flag to <code>true</code>. Staged will be empty. The parent Product must be published before a Variant can be published. Generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishedMessage" rel="nofollow">VariantPublished</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantPublishAction variantPublishAction = VariantPublishAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("publish")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantPublishActionImpl.class)
public interface VariantPublishAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantPublishAction
     */
    String PUBLISH = "publish";

    /**
     * factory method
     * @return instance of VariantPublishAction
     */
    public static VariantPublishAction of() {
        return new VariantPublishActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantPublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantPublishAction of(final VariantPublishAction template) {
        VariantPublishActionImpl instance = new VariantPublishActionImpl();
        return instance;
    }

    public VariantPublishAction copyDeep();

    /**
     * factory method to create a deep copy of VariantPublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantPublishAction deepCopy(@Nullable final VariantPublishAction template) {
        if (template == null) {
            return null;
        }
        VariantPublishActionImpl instance = new VariantPublishActionImpl();
        return instance;
    }

    /**
     * builder factory method for VariantPublishAction
     * @return builder
     */
    public static VariantPublishActionBuilder builder() {
        return VariantPublishActionBuilder.of();
    }

    /**
     * create builder for VariantPublishAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantPublishActionBuilder builder(final VariantPublishAction template) {
        return VariantPublishActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantPublishAction(Function<VariantPublishAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantPublishAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantPublishAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantPublishAction>";
            }
        };
    }
}
