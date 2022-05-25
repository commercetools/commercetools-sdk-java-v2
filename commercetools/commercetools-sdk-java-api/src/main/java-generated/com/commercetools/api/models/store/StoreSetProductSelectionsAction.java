
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetProductSelectionsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetProductSelectionsAction storeSetProductSelectionsAction = StoreSetProductSelectionsAction.builder()
 *             .plusProductSelections(productSelectionsBuilder -> productSelectionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetProductSelectionsActionImpl.class)
public interface StoreSetProductSelectionsAction extends StoreUpdateAction {

    String SET_PRODUCT_SELECTIONS = "setProductSelections";

    /**
     *  <p>The total of Product Selections to be set for this Store.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("productSelections")
    public List<ProductSelectionSettingDraft> getProductSelections();

    @JsonIgnore
    public void setProductSelections(final ProductSelectionSettingDraft... productSelections);

    public void setProductSelections(final List<ProductSelectionSettingDraft> productSelections);

    public static StoreSetProductSelectionsAction of() {
        return new StoreSetProductSelectionsActionImpl();
    }

    public static StoreSetProductSelectionsAction of(final StoreSetProductSelectionsAction template) {
        StoreSetProductSelectionsActionImpl instance = new StoreSetProductSelectionsActionImpl();
        instance.setProductSelections(template.getProductSelections());
        return instance;
    }

    public static StoreSetProductSelectionsActionBuilder builder() {
        return StoreSetProductSelectionsActionBuilder.of();
    }

    public static StoreSetProductSelectionsActionBuilder builder(final StoreSetProductSelectionsAction template) {
        return StoreSetProductSelectionsActionBuilder.of(template);
    }

    default <T> T withStoreSetProductSelectionsAction(Function<StoreSetProductSelectionsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetProductSelectionsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetProductSelectionsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetProductSelectionsAction>";
            }
        };
    }
}
