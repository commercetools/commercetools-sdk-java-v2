
package com.commercetools.api.models.graph_ql;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GraphQLErrorLocationBuilder {

    private Integer line;

    private Integer column;

    public GraphQLErrorLocationBuilder line(final Integer line) {
        this.line = line;
        return this;
    }

    public GraphQLErrorLocationBuilder column(final Integer column) {
        this.column = column;
        return this;
    }

    public Integer getLine() {
        return this.line;
    }

    public Integer getColumn() {
        return this.column;
    }

    public GraphQLErrorLocation build() {
        return new GraphQLErrorLocationImpl(line, column);
    }

    public static GraphQLErrorLocationBuilder of() {
        return new GraphQLErrorLocationBuilder();
    }

    public static GraphQLErrorLocationBuilder of(final GraphQLErrorLocation template) {
        GraphQLErrorLocationBuilder builder = new GraphQLErrorLocationBuilder();
        builder.line = template.getLine();
        builder.column = template.getColumn();
        return builder;
    }

}
