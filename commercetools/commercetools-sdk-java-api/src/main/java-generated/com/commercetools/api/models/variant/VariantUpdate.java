
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 * VariantUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantUpdate variantUpdate = VariantUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantUpdateImpl.class)
public interface VariantUpdate {

    /**
     *  <p>Expected version of the Variant on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Variant.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<VariantUpdateAction> getActions();

    /**
     *  <p>Expected version of the Variant on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Variant.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final VariantUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Variant.</p>
     * @param actions values to be set
     */

    public void setActions(final List<VariantUpdateAction> actions);

    /**
     * factory method
     * @return instance of VariantUpdate
     */
    public static VariantUpdate of() {
        return new VariantUpdateImpl();
    }

    /**
     * factory method to create a shallow copy VariantUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantUpdate of(final VariantUpdate template) {
        VariantUpdateImpl instance = new VariantUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public VariantUpdate copyDeep();

    /**
     * factory method to create a deep copy of VariantUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantUpdate deepCopy(@Nullable final VariantUpdate template) {
        if (template == null) {
            return null;
        }
        VariantUpdateImpl instance = new VariantUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.variant.VariantUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantUpdate
     * @return builder
     */
    public static VariantUpdateBuilder builder() {
        return VariantUpdateBuilder.of();
    }

    /**
     * create builder for VariantUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantUpdateBuilder builder(final VariantUpdate template) {
        return VariantUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantUpdate(Function<VariantUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantUpdate> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<VariantUpdate>";
            }
        };
    }
}
