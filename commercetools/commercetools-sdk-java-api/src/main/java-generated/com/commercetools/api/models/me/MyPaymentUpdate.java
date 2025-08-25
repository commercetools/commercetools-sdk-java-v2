
package com.commercetools.api.models.me;

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
 * MyPaymentUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentUpdate myPaymentUpdate = MyPaymentUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentUpdateImpl.class)
public interface MyPaymentUpdate extends
        com.commercetools.api.models.ResourceUpdate<MyPaymentUpdate, MyPaymentUpdateAction, MyPaymentUpdateBuilder> {

    /**
     *  <p>Expected version of the Payment on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyPaymentUpdateAction> getActions();

    /**
     *  <p>Expected version of the Payment on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final MyPaymentUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param actions values to be set
     */

    public void setActions(final List<MyPaymentUpdateAction> actions);

    /**
     * factory method
     * @return instance of MyPaymentUpdate
     */
    public static MyPaymentUpdate of() {
        return new MyPaymentUpdateImpl();
    }

    /**
     * factory method to create a shallow copy MyPaymentUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPaymentUpdate of(final MyPaymentUpdate template) {
        MyPaymentUpdateImpl instance = new MyPaymentUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public MyPaymentUpdate copyDeep();

    /**
     * factory method to create a deep copy of MyPaymentUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPaymentUpdate deepCopy(@Nullable final MyPaymentUpdate template) {
        if (template == null) {
            return null;
        }
        MyPaymentUpdateImpl instance = new MyPaymentUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.me.MyPaymentUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyPaymentUpdate
     * @return builder
     */
    public static MyPaymentUpdateBuilder builder() {
        return MyPaymentUpdateBuilder.of();
    }

    /**
     * create builder for MyPaymentUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentUpdateBuilder builder(final MyPaymentUpdate template) {
        return MyPaymentUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentUpdate(Function<MyPaymentUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentUpdate>";
            }
        };
    }
}
