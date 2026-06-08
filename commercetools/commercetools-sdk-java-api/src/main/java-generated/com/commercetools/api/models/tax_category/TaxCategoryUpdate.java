
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * TaxCategoryUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryUpdate taxCategoryUpdate = TaxCategoryUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategoryUpdateImpl.class)
public interface TaxCategoryUpdate extends
        com.commercetools.api.models.ResourceUpdate<TaxCategoryUpdate, TaxCategoryUpdateAction, TaxCategoryUpdateBuilder> {

    /**
     *  <p>Expected version of the TaxCategory on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the TaxCategory.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<TaxCategoryUpdateAction> getActions();

    /**
     *  <p>Expected version of the TaxCategory on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the TaxCategory.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final TaxCategoryUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the TaxCategory.</p>
     * @param actions values to be set
     */

    public void setActions(final List<TaxCategoryUpdateAction> actions);

    /**
     * factory method
     * @return instance of TaxCategoryUpdate
     */
    public static TaxCategoryUpdate of() {
        return new TaxCategoryUpdateImpl();
    }

    /**
     * factory method to create a shallow copy TaxCategoryUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryUpdate of(final TaxCategoryUpdate template) {
        TaxCategoryUpdateImpl instance = new TaxCategoryUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public TaxCategoryUpdate copyDeep();

    /**
     * factory method to create a deep copy of TaxCategoryUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategoryUpdate deepCopy(@Nullable final TaxCategoryUpdate template) {
        if (template == null) {
            return null;
        }
        TaxCategoryUpdateImpl instance = new TaxCategoryUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.tax_category.TaxCategoryUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for TaxCategoryUpdate
     * @return builder
     */
    public static TaxCategoryUpdateBuilder builder() {
        return TaxCategoryUpdateBuilder.of();
    }

    /**
     * create builder for TaxCategoryUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryUpdateBuilder builder(final TaxCategoryUpdate template) {
        return TaxCategoryUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategoryUpdate(Function<TaxCategoryUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryUpdate>";
            }
        };
    }
}
