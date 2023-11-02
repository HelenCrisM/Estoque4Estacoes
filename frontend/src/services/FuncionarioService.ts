import axios from "axios";
import IFuncionarioData from "../types/Funcionario";

const API_URL = 'http://localhost:8080/';

class FuncionarioService {

  public async  getAllFuncionarios() {
    try {
        const response = await axios.get<IFuncionarioData>(API_URL);
        return await response.data;           
    } catch (error) {
        console.log(error)
        throw error;
    }
  }

}
// const getAll = () => {
//   return http.get<Array<IFuncionarioDataData>>("/funcionario");
// };

// const get = (id: any) => {
//   return http.get<IFuncionarioDataData>(`/funcionario/${id}`);
// };

// const create = (data: IFuncionarioDataData) => {
//   return http.post<IFuncionarioDataData>("/funcionario", data);
// };

// const update = (id: any, data: IFuncionarioDataData) => {
//   return http.put<any>(`/funcionario/${id}`, data);
// };

// const remove = (id: any) => {
//   return http.delete<any>(`/funcionario/${id}`);
// };

// const removeAll = () => {
//   return http.delete<any>(`/funcionario`);
// };


// const FuncionarioService = {
//   getAll,
//   get,
//   create,
//   update,
//   remove,
//   removeAll,
// };

export default new FuncionarioService();
