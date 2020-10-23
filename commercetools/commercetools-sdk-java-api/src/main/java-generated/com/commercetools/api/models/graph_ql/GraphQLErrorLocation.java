package com.commercetools.api.models.graph_ql;


import com.commercetools.api.models.graph_ql.GraphQLErrorLocationImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = GraphQLErrorLocationImpl.class)
public interface GraphQLErrorLocation  {

    
    @NotNull
    @JsonProperty("line")
    public Integer getLine();
    
    @NotNull
    @JsonProperty("column")
    public Integer getColumn();

    public void setLine(final Integer line);
    
    public void setColumn(final Integer column);

    public static GraphQLErrorLocationImpl of(){
        return new GraphQLErrorLocationImpl();
    }
    

    public static GraphQLErrorLocationImpl of(final GraphQLErrorLocation template) {
        GraphQLErrorLocationImpl instance = new GraphQLErrorLocationImpl();
        instance.setLine(template.getLine());
        instance.setColumn(template.getColumn());
        return instance;
    }

    default <T> T withGraphQLErrorLocation(Function<GraphQLErrorLocation, T> helper) {
        return helper.apply(this);
    }
}
