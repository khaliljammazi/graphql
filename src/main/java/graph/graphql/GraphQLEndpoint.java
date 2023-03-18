package graph.graphql;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import graph.repositories.StudentRepository;
import graphql.schema.*;
import graphql.servlet.*;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

  public GraphQLEndpoint() {
    super(buildSchema());
  }

  public static GraphQLSchema buildSchema() {
    StudentRepository studentRepository = new StudentRepository();
    return SchemaParser.newParser().file("schema.graphqls").resolvers(new Query(studentRepository)).build()
        .makeExecutableSchema();
  }
}
