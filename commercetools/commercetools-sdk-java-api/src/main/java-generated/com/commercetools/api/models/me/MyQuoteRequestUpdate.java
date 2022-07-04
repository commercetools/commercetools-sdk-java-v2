
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyQuoteRequestUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final MyQuoteRequestUpdateAction... actions);

    public void setActions(final List<MyQuoteRequestUpdateAction> actions);

    public static MyQuoteRequestUpdate of() {
        return new MyQuoteRequestUpdateImpl();
    }

    public static MyQuoteRequestUpdate of(final MyQuoteRequestUpdate template) {
        MyQuoteRequestUpdateImpl instance = new MyQuoteRequestUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static MyQuoteRequestUpdateBuilder builder() {
        return MyQuoteRequestUpdateBuilder.of();
    }

    public static MyQuoteRequestUpdateBuilder builder(final MyQuoteRequestUpdate template) {
        return MyQuoteRequestUpdateBuilder.of(template);
    }

    default <T> T withMyQuoteRequestUpdate(Function<MyQuoteRequestUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteRequestUpdate>";
            }
        };
    }
}
