
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteRequestUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteRequestUpdate myQuoteRequestUpdate = MyQuoteRequestUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyQuoteRequestUpdateImpl.class)
public interface MyQuoteRequestUpdate extends
        com.commercetools.api.models.ResourceUpdate<MyQuoteRequestUpdate, MyQuoteRequestUpdateAction, MyQuoteRequestUpdateBuilder> {

    /**
     *
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyQuoteRequestUpdateAction> getActions();

    /**
     * set version
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     * set actions
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final MyQuoteRequestUpdateAction... actions);

    /**
     * set actions
     * @param actions values to be set
     */

    public void setActions(final List<MyQuoteRequestUpdateAction> actions);

    /**
     * factory method
     * @return instance of MyQuoteRequestUpdate
     */
    public static MyQuoteRequestUpdate of() {
        return new MyQuoteRequestUpdateImpl();
    }

    /**
     * factory method to create a shallow copy MyQuoteRequestUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyQuoteRequestUpdate of(final MyQuoteRequestUpdate template) {
        MyQuoteRequestUpdateImpl instance = new MyQuoteRequestUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyQuoteRequestUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyQuoteRequestUpdate deepCopy(@Nullable final MyQuoteRequestUpdate template) {
        if (template == null) {
            return null;
        }
        MyQuoteRequestUpdateImpl instance = new MyQuoteRequestUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.me.MyQuoteRequestUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyQuoteRequestUpdate
     * @return builder
     */
    public static MyQuoteRequestUpdateBuilder builder() {
        return MyQuoteRequestUpdateBuilder.of();
    }

    /**
     * create builder for MyQuoteRequestUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyQuoteRequestUpdateBuilder builder(final MyQuoteRequestUpdate template) {
        return MyQuoteRequestUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyQuoteRequestUpdate(Function<MyQuoteRequestUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteRequestUpdate>";
            }
        };
    }
}
