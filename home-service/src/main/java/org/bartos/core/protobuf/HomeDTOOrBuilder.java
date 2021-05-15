// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/home.proto

package org.bartos.core.protobuf;

public interface HomeDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:home.HomeDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .home.RoomDTO room = 3;</code>
   */
  java.util.List<org.bartos.core.protobuf.RoomDTO> 
      getRoomList();
  /**
   * <code>repeated .home.RoomDTO room = 3;</code>
   */
  org.bartos.core.protobuf.RoomDTO getRoom(int index);
  /**
   * <code>repeated .home.RoomDTO room = 3;</code>
   */
  int getRoomCount();
  /**
   * <code>repeated .home.RoomDTO room = 3;</code>
   */
  java.util.List<? extends org.bartos.core.protobuf.RoomDTOOrBuilder> 
      getRoomOrBuilderList();
  /**
   * <code>repeated .home.RoomDTO room = 3;</code>
   */
  org.bartos.core.protobuf.RoomDTOOrBuilder getRoomOrBuilder(
      int index);

  /**
   * <code>repeated string users = 4;</code>
   * @return A list containing the users.
   */
  java.util.List<java.lang.String>
      getUsersList();
  /**
   * <code>repeated string users = 4;</code>
   * @return The count of users.
   */
  int getUsersCount();
  /**
   * <code>repeated string users = 4;</code>
   * @param index The index of the element to return.
   * @return The users at the given index.
   */
  java.lang.String getUsers(int index);
  /**
   * <code>repeated string users = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the users at the given index.
   */
  com.google.protobuf.ByteString
      getUsersBytes(int index);

  /**
   * <code>repeated string devices = 5;</code>
   * @return A list containing the devices.
   */
  java.util.List<java.lang.String>
      getDevicesList();
  /**
   * <code>repeated string devices = 5;</code>
   * @return The count of devices.
   */
  int getDevicesCount();
  /**
   * <code>repeated string devices = 5;</code>
   * @param index The index of the element to return.
   * @return The devices at the given index.
   */
  java.lang.String getDevices(int index);
  /**
   * <code>repeated string devices = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the devices at the given index.
   */
  com.google.protobuf.ByteString
      getDevicesBytes(int index);

  /**
   * <code>repeated .home.HomeDTO.HomeInvitationDTO invitations = 6;</code>
   */
  java.util.List<org.bartos.core.protobuf.HomeDTO.HomeInvitationDTO> 
      getInvitationsList();
  /**
   * <code>repeated .home.HomeDTO.HomeInvitationDTO invitations = 6;</code>
   */
  org.bartos.core.protobuf.HomeDTO.HomeInvitationDTO getInvitations(int index);
  /**
   * <code>repeated .home.HomeDTO.HomeInvitationDTO invitations = 6;</code>
   */
  int getInvitationsCount();
  /**
   * <code>repeated .home.HomeDTO.HomeInvitationDTO invitations = 6;</code>
   */
  java.util.List<? extends org.bartos.core.protobuf.HomeDTO.HomeInvitationDTOOrBuilder> 
      getInvitationsOrBuilderList();
  /**
   * <code>repeated .home.HomeDTO.HomeInvitationDTO invitations = 6;</code>
   */
  org.bartos.core.protobuf.HomeDTO.HomeInvitationDTOOrBuilder getInvitationsOrBuilder(
      int index);
}
