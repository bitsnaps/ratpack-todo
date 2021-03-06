/*
 * This file is generated by jOOQ.
*/
package jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.Indexes;
import jooq.Keys;
import jooq.Public;
import jooq.tables.records.TodoRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Todo extends TableImpl<TodoRecord> {

    private static final long serialVersionUID = 716208072;

    /**
     * The reference instance of <code>PUBLIC.TODO</code>
     */
    public static final Todo TODO = new Todo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TodoRecord> getRecordType() {
        return TodoRecord.class;
    }

    /**
     * The column <code>PUBLIC.TODO.ID</code>.
     */
    public final TableField<TodoRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.TODO.TITLE</code>.
     */
    public final TableField<TodoRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>PUBLIC.TODO.ORDER</code>.
     */
    public final TableField<TodoRecord, Integer> ORDER = createField("ORDER", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>PUBLIC.TODO.COMPLETED</code>.
     */
    public final TableField<TodoRecord, Boolean> COMPLETED = createField("COMPLETED", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("FALSE", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>PUBLIC.TODO</code> table reference
     */
    public Todo() {
        this(DSL.name("TODO"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.TODO</code> table reference
     */
    public Todo(String alias) {
        this(DSL.name(alias), TODO);
    }

    /**
     * Create an aliased <code>PUBLIC.TODO</code> table reference
     */
    public Todo(Name alias) {
        this(alias, TODO);
    }

    private Todo(Name alias, Table<TodoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Todo(Name alias, Table<TodoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TodoRecord, Long> getIdentity() {
        return Keys.IDENTITY_TODO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Todo as(String alias) {
        return new Todo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Todo as(Name alias) {
        return new Todo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Todo rename(String name) {
        return new Todo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Todo rename(Name name) {
        return new Todo(name, null);
    }
}
