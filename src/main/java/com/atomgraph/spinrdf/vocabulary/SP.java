/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  See the NOTICE file distributed with this work for additional
 *  information regarding copyright ownership.
 */
package com.atomgraph.spinrdf.vocabulary;

import com.atomgraph.spinrdf.model.Argument;
import com.atomgraph.spinrdf.model.Command;
import com.atomgraph.spinrdf.model.Query;
import com.atomgraph.spinrdf.model.Template;
import com.atomgraph.spinrdf.model.TemplateCall;
import com.atomgraph.spinrdf.model.impl.ArgumentImpl;
import com.atomgraph.spinrdf.model.impl.CommandImpl;
import com.atomgraph.spinrdf.model.impl.QueryImpl;
import com.atomgraph.spinrdf.model.impl.TemplateCallImpl;
import com.atomgraph.spinrdf.model.impl.TemplateImpl;
import com.atomgraph.spinrdf.model.update.Update;
import com.atomgraph.spinrdf.model.update.impl.UpdateImpl;
import org.apache.jena.enhanced.BuiltinPersonalities;
import org.apache.jena.enhanced.Personality;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;

/**
 *
 * @author Martynas Jusevičius <martynas@atomgraph.com>
 */
public class SP
{
    
    public final static String BASE_URI = "http://spinrdf.org/sp";

    public final static String NS = BASE_URI + "#";

    public final static String PREFIX = "sp";
    
    public final static String VAR_NS = "http://spinrdf.org/var#";

    public final static String VAR_PREFIX = "var";


    public final static Resource Aggregation = ResourceFactory.createResource(NS + "Aggregation");

    public final static Resource AltPath = ResourceFactory.createResource(NS + "AltPath");

    public final static Resource Asc = ResourceFactory.createResource(NS + "Asc");

    public final static Resource Ask = ResourceFactory.createResource(NS + "Ask");

    public final static Resource Avg = ResourceFactory.createResource(NS + "Avg");

    public final static Resource Bind = ResourceFactory.createResource(NS + "Bind");

    public final static Resource Clear = ResourceFactory.createResource(NS + "Clear");

    public final static Resource Command = ResourceFactory.createResource(NS + "Command");

    public final static Resource Construct = ResourceFactory.createResource(NS + "Construct");

    public final static Resource Count = ResourceFactory.createResource(NS + "Count");

    public final static Resource Create = ResourceFactory.createResource(NS + "Create");

    @Deprecated
    public final static Resource Delete = ResourceFactory.createResource(NS + "Delete");

    public final static Resource DeleteData = ResourceFactory.createResource(NS + "DeleteData");

    public final static Resource DeleteWhere = ResourceFactory.createResource(NS + "DeleteWhere");

    public final static Resource Desc = ResourceFactory.createResource(NS + "Desc");

    public final static Resource Describe = ResourceFactory.createResource(NS + "Describe");

    public final static Resource Drop = ResourceFactory.createResource(NS + "Drop");

    public final static Resource exists = ResourceFactory.createResource(NS + "exists");

    public final static Resource Exists = ResourceFactory.createResource(NS + "Exists");

    public final static Resource Expression = ResourceFactory.createResource(NS + "Expression");

    public final static Resource Filter = ResourceFactory.createResource(NS + "Filter");

    @Deprecated
    public final static Resource Insert = ResourceFactory.createResource(NS + "Insert");

    public final static Resource InsertData = ResourceFactory.createResource(NS + "InsertData");

    @Deprecated
    public final static Resource Let = ResourceFactory.createResource(NS + "Let");

    public final static Resource Load = ResourceFactory.createResource(NS + "Load");

    public final static Resource Max = ResourceFactory.createResource(NS + "Max");

    public final static Resource Min = ResourceFactory.createResource(NS + "Min");

    public final static Resource Modify = ResourceFactory.createResource(NS + "Modify");

    public final static Resource ModPath = ResourceFactory.createResource(NS + "ModPath");

    public final static Resource Minus = ResourceFactory.createResource(NS + "Minus");

    public final static Resource NamedGraph = ResourceFactory.createResource(NS + "NamedGraph");

    public final static Resource notExists = ResourceFactory.createResource(NS + "notExists");

    public final static Resource NotExists = ResourceFactory.createResource(NS + "NotExists");

    public final static Resource Optional = ResourceFactory.createResource(NS + "Optional");

    public final static Resource Query = ResourceFactory.createResource(NS + "Query");

    public final static Resource ReverseLinkPath = ResourceFactory.createResource(NS + "ReverseLinkPath");

    public final static Resource ReversePath = ResourceFactory.createResource(NS + "ReversePath");

    public final static Resource Select = ResourceFactory.createResource(NS + "Select");

    public final static Resource Service = ResourceFactory.createResource(NS + "Service");

    public final static Resource SeqPath = ResourceFactory.createResource(NS + "SeqPath");

    public final static Resource SubQuery = ResourceFactory.createResource(NS + "SubQuery");

    public final static Resource Sum = ResourceFactory.createResource(NS + "Sum");

    public final static Resource Triple = ResourceFactory.createResource(NS + "Triple");

    public final static Resource TriplePath = ResourceFactory.createResource(NS + "TriplePath");

    public final static Resource TriplePattern = ResourceFactory.createResource(NS + "TriplePattern");

    public final static Resource TripleTemplate = ResourceFactory.createResource(NS + "TripleTemplate");

    public final static Resource undef = ResourceFactory.createResource(NS + "undef");

    public final static Resource Union = ResourceFactory.createResource(NS + "Union");

    public final static Resource Update = ResourceFactory.createResource(NS + "Update");

    public final static Resource Values = ResourceFactory.createResource(NS + "Values");

    public final static Resource Variable = ResourceFactory.createResource(NS + "Variable");


    public final static Property all = ResourceFactory.createProperty(NS + "all");

    public final static Property arg = ResourceFactory.createProperty(NS + "arg");

    public final static Property arg1 = ResourceFactory.createProperty(NS + "arg1");

    public final static Property arg2 = ResourceFactory.createProperty(NS + "arg2");

    public final static Property arg3 = ResourceFactory.createProperty(NS + "arg3");

    public final static Property arg4 = ResourceFactory.createProperty(NS + "arg4");

    public final static Property arg5 = ResourceFactory.createProperty(NS + "arg5");
    
    public final static Property as = ResourceFactory.createProperty(NS + "as");
    
    public final static Property bindings = ResourceFactory.createProperty(NS + "bindings");

    public final static Property data = ResourceFactory.createProperty(NS + "data");

    public final static Property default_ = ResourceFactory.createProperty(NS + "default");
    
    public final static Property deletePattern = ResourceFactory.createProperty(NS + "deletePattern");
    
    public final static Property distinct = ResourceFactory.createProperty(NS + "distinct");
    
    public final static Property document = ResourceFactory.createProperty(NS + "document");
    
    public final static Property elements = ResourceFactory.createProperty(NS + "elements");
    
    public final static Property expression = ResourceFactory.createProperty(NS + "expression");
    
    public final static Property from = ResourceFactory.createProperty(NS + "from");
    
    public final static Property fromNamed = ResourceFactory.createProperty(NS + "fromNamed");

    public final static Property graphIRI = ResourceFactory.createProperty(NS + "graphIRI");
    
    public final static Property graphNameNode = ResourceFactory.createProperty(NS + "graphNameNode");
    
    public final static Property groupBy = ResourceFactory.createProperty(NS + "groupBy");
    
    public final static Property having = ResourceFactory.createProperty(NS + "having");
    
    public final static Property insertPattern = ResourceFactory.createProperty(NS + "insertPattern");
    
    public final static Property into = ResourceFactory.createProperty(NS + "into");
    
    public final static Property limit = ResourceFactory.createProperty(NS + "limit");
    
    public final static Property modMax = ResourceFactory.createProperty(NS + "modMax");
    
    public final static Property modMin = ResourceFactory.createProperty(NS + "modMin");

    public final static Property named = ResourceFactory.createProperty(NS + "named");
    
    public final static Property node = ResourceFactory.createProperty(NS + "node");
    
    public final static Property object = ResourceFactory.createProperty(NS + "object");
    
    public final static Property offset = ResourceFactory.createProperty(NS + "offset");
    
    public final static Property orderBy = ResourceFactory.createProperty(NS + "orderBy");
    
    public final static Property path = ResourceFactory.createProperty(NS + "path");
    
    public final static Property path1 = ResourceFactory.createProperty(NS + "path1");
    
    public final static Property path2 = ResourceFactory.createProperty(NS + "path2");

    public final static Property predicate = ResourceFactory.createProperty(NS + "predicate");
    
    public final static Property query = ResourceFactory.createProperty(NS + "query");

    public final static Property reduced = ResourceFactory.createProperty(NS + "reduced");

    public final static Property resultNodes = ResourceFactory.createProperty(NS + "resultNodes");

    public final static Property resultVariables = ResourceFactory.createProperty(NS + "resultVariables");
    
    public final static Property separator = ResourceFactory.createProperty(NS + "separator");
    
    public final static Property serviceURI = ResourceFactory.createProperty(NS + "serviceURI");
    
    public final static Property silent = ResourceFactory.createProperty(NS + "silent");

    public final static Property str = ResourceFactory.createProperty(NS + "str");

    public final static Property strlang = ResourceFactory.createProperty(NS + "strlang");

    public final static Property subject = ResourceFactory.createProperty(NS + "subject");

    public final static Property subPath = ResourceFactory.createProperty(NS + "subPath");

    public final static Property templates = ResourceFactory.createProperty(NS + "templates");

    public final static Property text = ResourceFactory.createProperty(NS + "text");
    
    public final static Property using = ResourceFactory.createProperty(NS + "using");
    
    public final static Property usingNamed = ResourceFactory.createProperty(NS + "usingNamed");
    
    public final static Property values = ResourceFactory.createProperty(NS + "values");

    public final static Property variable = ResourceFactory.createProperty(NS + "variable");
    
    public final static Property varName = ResourceFactory.createProperty(NS + "varName");
    
    public final static Property varNames = ResourceFactory.createProperty(NS + "varNames");
    
    public final static Property where = ResourceFactory.createProperty(NS + "where");
    
    public final static Property with = ResourceFactory.createProperty(NS + "with");
    
    
    public final static Resource bound = ResourceFactory.createResource(NS + "bound");
    
    public final static Resource eq = ResourceFactory.createResource(NS + "eq");
    
    public final static Resource not = ResourceFactory.createResource(NS + "not");

    public final static Resource regex = ResourceFactory.createResource(NS + "regex");

    public final static Resource sub = ResourceFactory.createResource(NS + "sub");

    public final static Resource unaryMinus = ResourceFactory.createResource(NS + "unaryMinus");

    public static Integer getArgPropertyIndex(String varName)
    {
        if (varName.startsWith("arg"))
        {
            String subString = varName.substring(3);
            try
            {
                return Integer.getInteger(subString);
            }
            catch(Throwable t)
            {
            }
        }
        
        return null;
    }
    
    static
    {
        SP.init(BuiltinPersonalities.model);
    }
    
    public static void init(Personality<RDFNode> p)
    {
        p.add(Template.class, TemplateImpl.factory);
        p.add(Argument.class, ArgumentImpl.factory);
        p.add(TemplateCall.class, TemplateCallImpl.factory);
        p.add(Command.class, CommandImpl.factory);
        p.add(Query.class, QueryImpl.factory);
        p.add(Update.class, UpdateImpl.factory);
    }
    
}
