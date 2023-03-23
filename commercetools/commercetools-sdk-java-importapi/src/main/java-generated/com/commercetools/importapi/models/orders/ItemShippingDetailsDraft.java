
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ItemShippingDetailsDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemShippingDetailsDraft itemShippingDetailsDraft = ItemShippingDetailsDraft.builder()
 *             .plusTargets(targetsBuilder -> targetsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ItemShippingDetailsDraftImpl.class)
public interface ItemShippingDetailsDraft extends io.vrap.rmf.base.client.Draft<ItemShippingDetailsDraft> {

    /**
     *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
     * @return targets
     */
    @NotNull
    @Valid
    @JsonProperty("targets")
    public List<ItemShippingTarget> getTargets();

    @JsonIgnore
    public void setTargets(final ItemShippingTarget... targets);

    public void setTargets(final List<ItemShippingTarget> targets);

    public static ItemShippingDetailsDraft of() {
        return new ItemShippingDetailsDraftImpl();
    }

    public static ItemShippingDetailsDraft of(final ItemShippingDetailsDraft template) {
        ItemShippingDetailsDraftImpl instance = new ItemShippingDetailsDraftImpl();
        instance.setTargets(template.getTargets());
        return instance;
    }

    public static ItemShippingDetailsDraftBuilder builder() {
        return ItemShippingDetailsDraftBuilder.of();
    }

    public static ItemShippingDetailsDraftBuilder builder(final ItemShippingDetailsDraft template) {
        return ItemShippingDetailsDraftBuilder.of(template);
    }

    default <T> T withItemShippingDetailsDraft(Function<ItemShippingDetailsDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ItemShippingDetailsDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ItemShippingDetailsDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ItemShippingDetailsDraft>";
            }
        };
    }
}
