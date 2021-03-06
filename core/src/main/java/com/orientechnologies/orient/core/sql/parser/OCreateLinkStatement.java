/* Generated By:JJTree: Do not edit this line. OCreateLinkStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

public class OCreateLinkStatement extends OStatement {

  protected OIdentifier      name;
  protected OIdentifier      type;
  protected OIdentifier      sourceClass;
  protected OIdentifier      sourceField;
  protected ORecordAttribute sourceRecordAttr;
  protected OIdentifier      destClass;
  protected OIdentifier      destField;
  protected ORecordAttribute destRecordAttr;
  protected boolean inverse = false;

  public OCreateLinkStatement(int id) {
    super(id);
  }

  public OCreateLinkStatement(OrientSql p, int id) {
    super(p, id);
  }

  @Override
  public void toString(Map<Object, Object> params, StringBuilder builder) {
    builder.append("CREATE LINK ");
    name.toString(params, builder);
    builder.append(" TYPE ");
    type.toString(params, builder);
    builder.append(" FROM ");
    sourceClass.toString(params, builder);
    builder.append(".");
    if (sourceField != null) {
      sourceField.toString(params, builder);
    } else {
      sourceRecordAttr.toString(params, builder);
    }
    builder.append(" TO ");
    destClass.toString(params, builder);
    builder.append(".");
    if (destField != null) {
      destField.toString(params, builder);
    } else {
      destRecordAttr.toString(params, builder);
    }
    if (inverse) {
      builder.append(" INVERSE");
    }
  }
}
/* JavaCC - OriginalChecksum=de46c9bdaf3b36691764a78cd89d1c2b (do not edit this line) */
