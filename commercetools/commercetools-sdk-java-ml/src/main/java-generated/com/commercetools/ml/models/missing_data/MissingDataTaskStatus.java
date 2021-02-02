
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.ml.models.common.TaskStatusEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Represents a URL path to poll to get the results of an Asynchronous Request.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingDataTaskStatusImpl.class)
public interface MissingDataTaskStatus {

    @NotNull
    @JsonProperty("state")
    public TaskStatusEnum getState();

    /**
    *  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>
    */
    @NotNull
    @JsonProperty("expires")
    public ZonedDateTime getExpires();

    /**
    *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("result")
    public MissingAttributesPagedQueryResult getResult();

    public void setState(final TaskStatusEnum state);

    public void setExpires(final ZonedDateTime expires);

    public void setResult(final MissingAttributesPagedQueryResult result);

    public static MissingDataTaskStatus of() {
        return new MissingDataTaskStatusImpl();
    }

    public static MissingDataTaskStatus of(final MissingDataTaskStatus template) {
        MissingDataTaskStatusImpl instance = new MissingDataTaskStatusImpl();
        instance.setState(template.getState());
        instance.setExpires(template.getExpires());
        instance.setResult(template.getResult());
        return instance;
    }

    public static MissingDataTaskStatusBuilder builder() {
        return MissingDataTaskStatusBuilder.of();
    }

    public static MissingDataTaskStatusBuilder builder(final MissingDataTaskStatus template) {
        return MissingDataTaskStatusBuilder.of(template);
    }

    default <T> T withMissingDataTaskStatus(Function<MissingDataTaskStatus, T> helper) {
        return helper.apply(this);
    }
}
