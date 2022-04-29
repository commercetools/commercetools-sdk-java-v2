
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = GraphQLErrorLocationImpl.class)
public interface GraphQLErrorLocation {

    @NotNull
    @JsonProperty("line")
    public Integer getLine();

    @NotNull
    @JsonProperty("column")
    public Integer getColumn();

    public void setLine(final Integer line);

    public void setColumn(final Integer column);

    public static GraphQLErrorLocation of() {
        return new GraphQLErrorLocationImpl();
    }

    public static GraphQLErrorLocation of(final GraphQLErrorLocation template) {
        GraphQLErrorLocationImpl instance = new GraphQLErrorLocationImpl();
        instance.setLine(template.getLine());
        instance.setColumn(template.getColumn());
        return instance;
    }

    public static GraphQLErrorLocationBuilder builder() {
        return GraphQLErrorLocationBuilder.of();
    }

    public static GraphQLErrorLocationBuilder builder(final GraphQLErrorLocation template) {
        return GraphQLErrorLocationBuilder.of(template);
    }

    default <T> T withGraphQLErrorLocation(Function<GraphQLErrorLocation, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLErrorLocation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLErrorLocation>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLErrorLocation>";
            }
        };
    }
}
