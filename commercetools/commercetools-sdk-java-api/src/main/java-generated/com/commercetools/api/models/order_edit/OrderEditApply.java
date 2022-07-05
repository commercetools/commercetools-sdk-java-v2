
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditApply
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditApply orderEditApply = OrderEditApply.builder()
 *             .editVersion(0.3)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditApplyImpl.class)
public interface OrderEditApply {

    /**
     *
     */
    @NotNull
    @JsonProperty("editVersion")
    public Long getEditVersion();

    /**
     *
     */
    @NotNull
    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    public void setEditVersion(final Long editVersion);

    public void setResourceVersion(final Long resourceVersion);

    public static OrderEditApply of() {
        return new OrderEditApplyImpl();
    }

    public static OrderEditApply of(final OrderEditApply template) {
        OrderEditApplyImpl instance = new OrderEditApplyImpl();
        instance.setEditVersion(template.getEditVersion());
        instance.setResourceVersion(template.getResourceVersion());
        return instance;
    }

    public static OrderEditApplyBuilder builder() {
        return OrderEditApplyBuilder.of();
    }

    public static OrderEditApplyBuilder builder(final OrderEditApply template) {
        return OrderEditApplyBuilder.of(template);
    }

    default <T> T withOrderEditApply(Function<OrderEditApply, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditApply> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditApply>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditApply>";
            }
        };
    }
}
