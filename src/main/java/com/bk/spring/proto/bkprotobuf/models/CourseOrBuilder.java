// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.bk.spring.proto.bkprotobuf.models;

public interface CourseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.bk.spring.proto.bkprotobuf.Course)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>optional string course_name = 2;</code>
   */
  java.lang.String getCourseName();
  /**
   * <code>optional string course_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getCourseNameBytes();

  /**
   * <code>repeated .com.bk.spring.proto.bkprotobuf.Student student = 3;</code>
   */
  java.util.List<com.bk.spring.proto.bkprotobuf.models.Student> 
      getStudentList();
  /**
   * <code>repeated .com.bk.spring.proto.bkprotobuf.Student student = 3;</code>
   */
  com.bk.spring.proto.bkprotobuf.models.Student getStudent(int index);
  /**
   * <code>repeated .com.bk.spring.proto.bkprotobuf.Student student = 3;</code>
   */
  int getStudentCount();
  /**
   * <code>repeated .com.bk.spring.proto.bkprotobuf.Student student = 3;</code>
   */
  java.util.List<? extends com.bk.spring.proto.bkprotobuf.models.StudentOrBuilder> 
      getStudentOrBuilderList();
  /**
   * <code>repeated .com.bk.spring.proto.bkprotobuf.Student student = 3;</code>
   */
  com.bk.spring.proto.bkprotobuf.models.StudentOrBuilder getStudentOrBuilder(
      int index);
}
